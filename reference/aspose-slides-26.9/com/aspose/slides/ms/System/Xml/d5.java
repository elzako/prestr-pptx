package com.aspose.slides.ms.System.Xml;

public class d5 extends d2 {
   private int s3;
   private int i1;
   private String e5;
   private boolean b3;

   public d5(com.aspose.slides.internal.z0k.a0 var1, y7 var2) {
      super(var1, var2);
      this.n5(var2);
   }

   public d5(com.aspose.slides.internal.z0k.t4 var1, y7 var2) {
      super(var1, var2);
      this.n5(var2);
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
      super.n5(var1, var2, var3, var4);
      this.i1 = super.t2;
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      if (this.m3 && this.z8) {
         this.n5(false);
      }

      super.n5.n5((byte)super.l6);
      if (var3.length() == 0) {
         super.l6 = k5.n5(var2) & 0xFF;
         if (this.i1 == super.t2 && (super.l6 & 64L) != 0L) {
            this.h0();
         }

         this.s3++;
         super.z3[this.t2++] = '<';
      } else {
         super.l6 = 192L;
         if (this.i1 == super.t2) {
            this.h0();
         }

         this.s3++;
         super.z3[super.t2++] = '<';
         if (var1.length() != 0) {
            super.s7(var1);
            super.z3[super.t2++] = ':';
         }
      }

      super.s7(var2);
      super.y4 = this.t2;
   }

   @Override
   public void n5() {
      super.z3[super.t2++] = '>';
      super.x8 = super.t2;
      if ((this.l6 & 32L) != 0L) {
         this.h0();
         this.k5();
         this.i1 = super.t2;
      } else if ((super.l6 & 64L) != 0L) {
         this.i1 = super.t2;
      }
   }

   @Override
   public void l6(String var1, String var2, String var3) {
      this.s3--;
      boolean var4 = (super.l6 & 64L) != 0L;
      if (var4 && this.i1 == super.t2 && super.x8 != super.t2) {
         this.h0();
      }

      super.l6(var1, var2, var3);
      super.x8 = 0;
      if (var4) {
         this.i1 = super.t2;
      }
   }

   @Override
   public void u3(String var1, String var2, String var3) {
      if (this.b3) {
         this.s7(super.c4);
         this.s3++;
         this.h0();
         this.s3--;
      }

      super.u3(var1, var2, var3);
   }

   @Override
   protected void ab_() {
      this.i1 = this.i1 == super.t2 ? 1 : 0;
      super.ab_();
   }

   private void n5(y7 var1) {
      this.s3 = 0;
      this.e5 = var1.u9();
      this.b3 = var1.h0();
   }

   private void h0() {
      this.s7(super.c4);

      for (int var1 = this.s3; var1 > 0; var1--) {
         this.s7(this.e5);
      }
   }
}
