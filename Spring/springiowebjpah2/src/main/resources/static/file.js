/**function happy() {
	const foo = 'bar';
	return "😀";
}

function mood(emoji){
	return emoji;
}

function currentStatus(){
	console.log("call happy")
	return mood( happy() );
}

currentStatus()**/

/**function stackOverFLow( count = 1 ) {
	count++;
	return stackOverFLow(count);
}

stackOverFLow();**/

/**
function increment() {
	const step = 1;
	myCounter.value++;
}
const myCounter = { value: 0 };

increment();
increment();
increment();
**/

setTimeout(() => console.log ('do this first?'),0)
Promise.resolve().then(v => console.log('do this second?'))
console.log('let there be Javascript!')

