package com.aspose.slides.internal.c3;

public class u3 extends y8 {
   private final String n5;

   public u3(char var1) {
      super(2);
      this.n5 = com.aspose.slides.ms.System.d1.n5(var1, 1);
   }

   public u3(String var1) {
      super(2);
      this.n5 = var1;
   }

   public final String n5() {
      return this.n5;
   }

   @Override
   public String toString() {
      return this.n5();
   }

   public final boolean n5(char var1) {
      return this.n5.length() == 1 && com.aspose.slides.ms.System.t9.l6(this.n5.charAt(0), var1);
   }

   public final boolean l6() {
      for (int var1 = 0; var1 < this.n5.length(); var1++) {
         char var2 = this.n5.charAt(var1);
         switch (var2) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            default:
               return false;
         }
      }

      return true;
   }
}
