for remote in $(git branch); do
	if [[ "${remote}" != "origin/HEAD" ]]; then
		echo "git checkout ${remote}"
		git checkout ${remote}
		echo "mkdir & cp ../temp/${remote}"
		mkdir -p ../temp/${remote}
		cp -R ./ ../temp/${remote}
	fi
done
