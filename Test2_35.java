class Test2_35
{
static public void main(String ar[])
{
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
if(i==2)break;
System.out.println(j+"\t");
}
}
System.out.println();
}
}

/*
o/p=> 
      1
      2
      3
      4
      5
      1
      2
      3
      4
      5
      1
      2
      3
      4
      5
      1
      2
      3
      4
      5
	  
	  */