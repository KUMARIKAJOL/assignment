package Thread_package;

class Ques7 {

int eval(int[]...vars) {

int sum=0, b, c;

for(b = 0; b<vars.length; b++) {

for(c=0;c<vars[b].length; c++) {

sum += vars[b][c];

}

}

return(sum);

}

public static void main(String args[]) {

Ques7 varargs = new Ques7();

int sum =0;

sum = varargs.eval(new int[]{10,20,30,40}, new int[]{40,50,60});

System.out.println("The sum of the numbers is:" + sum);

}

}