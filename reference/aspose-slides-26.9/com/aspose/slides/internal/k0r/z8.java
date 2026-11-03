package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.Exception;

public class z8 extends r4 {
   private z1 n5;
   private z1 l6;
   private z1 k5;
   private m3 u3;
   private static final int[] a6 = new int[]{4026, 0, 4026, 1, 4026, 2, 12001, Integer.MAX_VALUE};

   public z8() {
      this.w1().n5(12000);
      this.u3 = new m3();
   }

   public final String l6() {
      return this.n5 != null ? this.n5.l6() : "";
   }

   public final void n5(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         this.n5 = null;
      } else {
         if (this.n5 == null) {
            this.n5 = new z1("", (short)0);
         }

         this.n5.n5(var1);
      }
   }

   public final String u3() {
      return this.l6 != null ? this.l6.l6() : "";
   }

   public final void l6(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         this.l6 = null;
      } else {
         if (this.l6 == null) {
            this.l6 = new z1("", (short)1);
         }

         this.l6.n5(var1);
      }
   }

   public final String a6() {
      return this.k5 != null ? this.k5.l6() : "";
   }

   public final void k5(String var1) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         this.k5 = null;
      } else {
         if (this.k5 == null) {
            this.k5 = new z1("", (short)2);
         }

         this.k5.n5(var1);
      }
   }

   public final m3 u9() {
      return this.u3;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.x8().getPosition() + this.w1().a6();

      while (var1.x8().getPosition() < var2) {
         e6r var4 = p5k.n5(var1, this);
         if (com.aspose.slides.internal.v6g.k5.l6(var4, z1.class)) {
            switch (var4.w1().k5()) {
               case 0:
                  this.n5 = (z1)var4;
                  break;
               case 1:
                  this.l6 = (z1)var4;
                  break;
               case 2:
                  this.k5 = (z1)var4;
                  break;
               default:
                  throw new Exception("Read Error! Unknown CString record in Comment10Container.");
            }
         } else {
            if (!com.aspose.slides.internal.v6g.k5.l6(var4, m3.class)) {
               throw new Exception("Read Error! Unknown record in Comment10Container.");
            }

            this.u3 = (m3)var4;
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.n5 != null) {
         this.n5.l6(var1);
      }

      if (this.l6 != null) {
         this.l6.l6(var1);
      }

      if (this.k5 != null) {
         this.k5.l6(var1);
      }

      if (this.u3 != null) {
         this.u3.l6(var1);
      } else {
         throw new Exception("Write Error! Comment10Container haven't Comment10Atom.");
      }
   }

   @Override
   public int n5() {
      int var1 = 0;
      if (this.n5 != null) {
         var1 += this.n5.n5() + 8;
      }

      if (this.l6 != null) {
         var1 += this.l6.n5() + 8;
      }

      if (this.k5 != null) {
         var1 += this.k5.n5() + 8;
      }

      if (this.u3 != null) {
         var1 += this.u3.n5() + 8;
      }

      return var1;
   }

   @Override
   protected int[] k5() {
      return a6;
   }
}
