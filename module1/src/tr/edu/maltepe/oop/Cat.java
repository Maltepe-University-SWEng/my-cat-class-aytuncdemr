package tr.edu.maltepe.oop;

class Cat {
   private String name;
   private int age;

   public Cat(String var1, int var2) {
      this.name = var1;
      this.age = var2;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int var1) {
      this.age = var1;
   }

   public void meow() {
      System.out.println("Meow!");
   }
}
