class Test2_23
{


static public void main(String [] ar)
{

int i;

for(i=1;false;i++)
{
i+=5;
}

System.out.println(i);

}



}

/*

o/p=>

     Test2_23.java:11: error: unreachable statement
     {
     ^
     1 error

*/