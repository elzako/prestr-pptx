package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class l1b {
   private int n5;
   private final n9q l6;
   private final u7f k5;

   public l1b() {
      this.n5(0);
      this.l6 = new n9q();
      this.k5 = new u7f();
   }

   public l1b(int var1) {
      this.n5(var1);
      this.l6 = new n9q();
      this.k5 = new u7f();
   }

   public final void n5(int var1) {
      if ((var1 & 65535) >= 5) {
         throw new ArgumentOutOfRangeException("2.9.36 TextMasterStyleLevel.level can't be more than 0x5.");
      }

      this.n5 = var1;
   }

   public final n9q n5() {
      return this.l6;
   }

   public final u7f l6() {
      return this.k5;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.l6("TextMasterStyleLevel: ");
      var1.l6(this.l6.toString());
      var1.n5(this.k5);
      return com.aspose.slides.ms.System.d1.n5(var1.toString(), "\n", "\n  ");
   }

   public final void n5(l1b var1) {
      this.l6.l6(var1.l6);
      this.k5.l6(var1.k5);
   }

   public final void l6(l1b var1) {
      this.l6.n5(var1.l6);
      this.k5.n5(var1.k5);
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1, short var2) {
      if (var2 >= 5) {
         this.n5 = var1.r4();
      }

      this.l6.n5(var1);
      this.k5.n5(var1);
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1, int var2, short var3) {
      if (var3 >= 5) {
         var1.n5(this.n5);
      }

      this.l6.n5(var1);
      this.k5.n5(var1);
   }

   final int n5(short var1) {
      int var2 = var1 >= 5 ? 2 : 0;
      var2 += this.l6.z8();
      return var2 + this.k5.q0();
   }
}
