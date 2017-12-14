function euroConverter()
{
	document.converter.dollar.value = document.converter.euro.value * 1.17;
	document.converter.sterling.value = document.converter.euro.value * 0.88
	document.converter.yen.value = document.converter.euro.value * 133.28;
}

function dollarConverter()
{
	document.converter.euro.value = document.converter.dollar.value * 0.85;
	document.converter.sterling.value = document.converter.dollar.value * 0.75
	document.converter.yen.value = document.converter.dollar.value * 113.5;
}

function sterlingConverter()
{
	document.converter.dollar.value = document.converter.sterling.value * 1.33;
	document.converter.euro.value = document.converter.sterling.value * 1.13;
	document.converter.yen.value = document.converter.sterling.value * 151.17;
}

function yenConverter()
{
	document.converter.dollar.value = document.converter.yen.value * 0.0088;
	document.converter.sterling.value = document.converter.yen.value * 0.0066;
	document.converter.euro.value = document.converter.yen.value * 0.0075;
}