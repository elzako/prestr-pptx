package com.aspose.slides.internal.k0r;

public class u3 extends r4 implements m4 {
   private long n5;
   private k5 l6;
   private h2 k5 = null;
   private k7 u3 = null;
   private l7h a6 = null;
   private f6z u9 = null;

   protected z1 n5(short var1) {
      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.e2().get_Item(var2), z1.class) && this.e2().get_Item(var2).w1().k5() == var1) {
            return (z1)this.e2().get_Item(var2);
         }
      }

      return null;
   }

   protected void n5(short var1, String var2) {
      z1 var3 = this.n5(var1);
      if (var3 != null) {
         if (var2 != null) {
            var3.n5(var2);
         } else {
            this.e2().removeItem(var3);
         }
      } else {
         this.n5(new z1(var2, (short)3));
      }
   }

   protected k5 n5(boolean var1) {
      if (this.l6 != null) {
         return this.l6;
      }

      if (!var1) {
         this.l6 = com.aspose.slides.internal.v6g.k5.n5(this.k5(com.aspose.slides.internal.v6g.k5.k5(1007, 9)), h3d.class);
      } else {
         this.l6 = com.aspose.slides.internal.v6g.k5.n5(this.k5(com.aspose.slides.internal.v6g.k5.k5(1009, 9)), m0.class);
      }

      if (this.l6 == null && this.n3()) {
         if (!var1) {
            this.l6 = new h3d();
         } else {
            this.l6 = new m0();
         }

         this.e2().insertItem(0, this.l6);
      }

      return this.l6;
   }

   public h2 l6() {
      if (this.k5 != null) {
         return this.k5;
      }

      this.k5 = (h2)this.k5(com.aspose.slides.internal.v6g.k5.k5(1036, 9));
      return this.k5;
   }

   public k7 u3() {
      if (this.u3 != null) {
         return this.u3;
      }

      this.u3 = (k7)this.n5(com.aspose.slides.internal.v6g.k5.k5(2032, 9), (short)1);
      if (this.u3 == null && this.n3()) {
         this.u3 = new k7();
         this.n5(this.u3);
      }

      return this.u3;
   }

   public l7h a6() {
      if (this.a6 != null) {
         return this.a6;
      }

      this.a6 = com.aspose.slides.internal.v6g.k5.n5(this.k5(com.aspose.slides.internal.v6g.k5.k5(5000, 9)), l7h.class);
      return this.a6;
   }

   public v2s u9() {
      return (v2s)this.k5(com.aspose.slides.internal.v6g.k5.k5(1038, 9));
   }

   public f6z h0() {
      if (this.u9 != null) {
         return this.u9;
      }

      this.u9 = (f6z)this.k5(com.aspose.slides.internal.v6g.k5.k5(1039, 9));
      return this.u9;
   }

   @Override
   public long c8() {
      return this.n5;
   }

   @Override
   public void n5(long var1) {
      this.n5 = var1;
   }
}
