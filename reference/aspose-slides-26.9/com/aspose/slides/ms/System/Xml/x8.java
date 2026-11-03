package com.aspose.slides.ms.System.Xml;

public class x8 extends com.aspose.slides.internal.l7h.z3 {
   private s7 c8;
   private String t2 = com.aspose.slides.ms.System.d1.n5;
   private int s7 = -1;

   public x8(s7 var1) {
      this.c8 = var1;
   }

   @Override
   public boolean n5(char var1, int var2) {
      if (this.s7 >= 0) {
         new com.aspose.slides.internal.l7h.z1().n5().n5(var1, var2);
      }

      if (this.c8.l6(var2)) {
         this.t2 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x7n.l6.k5(), "&#x{0:X};", Integer.valueOf(var1));
         this.s7 = 0;
         return true;
      } else {
         com.aspose.slides.internal.l7h.z3 var3 = new com.aspose.slides.internal.l7h.z1().n5();
         var3.n5(var1, var2);
         return false;
      }
   }

   @Override
   public boolean n5(char var1, char var2, int var3) {
      if (!com.aspose.slides.ms.System.t9.k5(var1, var2)) {
         throw f4.n5(var1, var2);
      }

      if (this.s7 >= 0) {
         new com.aspose.slides.internal.l7h.z1().n5().n5(var1, var2, var3);
      }

      if (this.c8.l6(var3)) {
         this.t2 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.internal.x7n.l6.k5(), "&#x{0:X};", this.n5(var1, var2));
         this.s7 = 0;
         return true;
      } else {
         com.aspose.slides.internal.l7h.z3 var4 = new com.aspose.slides.internal.l7h.z1().n5();
         var4.n5(var1, var2, var3);
         return false;
      }
   }

   @Override
   public char n5() {
      if (this.s7 == this.t2.length()) {
         this.s7 = -1;
      }

      return this.s7 == -1 ? '\u0000' : this.t2.charAt(this.s7++);
   }

   @Override
   public boolean l6() {
      if (this.s7 == -1) {
         return false;
      } else if (this.s7 > 0) {
         this.s7--;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int k5() {
      return this.s7 == -1 ? 0 : this.t2.length() - this.s7;
   }

   @Override
   public void u3() {
      this.s7 = -1;
   }

   private int n5(char var1, char var2) {
      return u4.n5(var2, var1);
   }
}
