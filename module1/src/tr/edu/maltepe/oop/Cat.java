import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Cat {
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
      System.out.println(this.name + " says: Meow!");
      this.playMeowSound("meow.wav");
   }

   private void playMeowSound(String var1) {
      try {
         File var2 = new File(var1);
         AudioInputStream var3 = AudioSystem.getAudioInputStream(var2);
         Clip var4 = AudioSystem.getClip();
         var4.open(var3);
         var4.start();
      } catch (IOException | LineUnavailableException | UnsupportedAudioFileException var5) {
         System.err.println("Error playing sound: " + var5.getMessage());
      }

   }

   public static void main(String[] var0) {
      Cat var1 = new Cat("Whiskers", 3);
      Cat var2 = new Cat("Mittens", 2);
      var1.meow();
      var2.meow();
   }
}
