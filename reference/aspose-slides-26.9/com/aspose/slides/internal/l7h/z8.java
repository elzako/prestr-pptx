package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

public final class z8 extends z3 {
   private String c8;
   private int t2 = -1;
   private int s7 = -1;

   public z8(m3 var1) {
      this.c8 = d1.n5(new String[]{var1.a6(), var1.a6()});
   }

   @Override
   public boolean n5(char var1, int var2) {
      if (this.t2 >= 1) {
         if (com.aspose.slides.ms.System.t9.a6(var1) && this.t2 >= 0 && com.aspose.slides.ms.System.t9.t2(this.c8.charAt(this.s7 + 1))) {
            this.n5(com.aspose.slides.ms.System.t9.n5(var1, this.c8.charAt(this.s7 + 1)));
         }

         this.n5(var1);
      }

      this.t2 = this.c8.length() / 2;
      this.s7 = -1;
      return this.t2 != 0;
   }

   @Override
   public boolean n5(char var1, char var2, int var3) {
      if (!com.aspose.slides.ms.System.t9.a6(var1)) {
         throw new ArgumentOutOfRangeException("charUnknownHigh", o0.n5("Valid values are between {0} and {1}, inclusive.", 55296, 56319));
      }

      if (!com.aspose.slides.ms.System.t9.t2(var2)) {
         throw new ArgumentOutOfRangeException("charUnknownLow", o0.n5("Valid values are between {0} and {1}, inclusive.", 56320, 57343));
      }

      if (this.t2 >= 1) {
         this.n5(com.aspose.slides.ms.System.t9.n5(var1, var2));
      }

      this.t2 = this.c8.length();
      this.s7 = -1;
      return this.t2 != 0;
   }

   @Override
   public char n5() {
      this.t2--;
      this.s7++;
      if (this.t2 < 0) {
         return '\u0000';
      } else if (this.t2 == Integer.MAX_VALUE) {
         this.t2 = -1;
         return '\u0000';
      } else {
         return this.c8.charAt(this.s7);
      }
   }

   @Override
   public boolean l6() {
      if (this.t2 >= -1 && this.s7 >= 0) {
         this.s7--;
         this.t2++;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int k5() {
      return this.t2 < 0 ? 0 : this.t2;
   }

   @Override
   public void u3() {
      this.t2 = -1;
      this.s7 = 0;
      this.n5 = 0;
      this.u9 = false;
   }
}
