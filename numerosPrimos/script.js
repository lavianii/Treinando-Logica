let primo = prompt("Digite um numero inteiro positivo para saber se é primo");
let divisor = 0;

if(primo < 0){
    document.write("Só pode digitar numeros inteiros positivos ");
}

for(let i = 1; i <= primo; i++){
    if(primo % i == 0){
        divisor++;
    }
}
if(divisor == 2){
    document.write(`O numero ${primo} é primo`);
}
else{
    document.write(`O numero ${primo} não é primo`);
}
