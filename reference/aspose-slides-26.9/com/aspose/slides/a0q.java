package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

class a0q {
   private final String n5;
   private int l6;

   public a0q(String var1) {
      this.n5 = com.aspose.slides.ms.System.d1.l6(var1);
      this.l6 = 0;
   }

   public final boolean n5() {
      return com.aspose.slides.ms.System.d1.n5(this.n5);
   }

   public final boolean l6() {
      return this.l6 >= this.n5.length();
   }

   public final int k5() {
      return this.l6;
   }

   public final char u3() {
      return this.n5.charAt(this.l6);
   }

   public final void a6() {
      while (com.aspose.slides.ms.System.t9.t9(this.u3()) && !this.l6()) {
         this.u9();
      }
   }

   public final void u9() {
      if (!this.l6()) {
         this.l6++;
      }
   }

   public final void n5(char var1) {
      this.n5(var1, true);
   }

   private void n5(char var1, boolean var2) {
      while (!this.l6() && this.u3() != var1) {
         this.u9();
      }
   }

   public final String n5(int var1, int var2) {
      if (var1 < 0 || var1 >= var2) {
         throw new ArgumentException("start");
      } else if (var2 > this.n5.length()) {
         throw new ArgumentException("end");
      } else {
         return com.aspose.slides.ms.System.d1.l6(this.n5, var1, var2 - var1);
      }
   }
}
