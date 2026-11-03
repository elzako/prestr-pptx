package com.aspose.slides.internal.d3v;

import com.aspose.slides.internal.a3p.y4;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.f5;
import com.aspose.slides.internal.r1x.q0;
import com.aspose.slides.internal.z0k.e2;

class n5 extends q0 {
   private com.aspose.slides.internal.b8u.n5 n5;
   private int l6;
   private int k5;
   private int u3;
   private com.aspose.slides.internal.b7s.q0 a6;

   public n5(int var1, int var2, com.aspose.slides.internal.b8u.n5 var3, com.aspose.slides.internal.f2i.n5 var4) {
      this.k5 = var1;
      this.l6 = var2;
      this.n5 = var3;
      this.u3 = this.l6 * this.k5;
      com.aspose.slides.internal.g7e.l6 var5 = new com.aspose.slides.internal.g7e.l6();
      var5.l6(f5.n5(var4.y2()));
      if (var4.y2() == 6) {
         y4 var6 = (y4)var4.s7(530);
         var5.n5(com.aspose.slides.internal.r6o.n5.n5(var6.y4()));
      }

      var5.n5((byte)var4.k7()[0]);
      var5.n5(var5.t4() == 8 ? 0 : 2);
      this.a6 = new com.aspose.slides.internal.b7s.q0(var5, var1, var2);
   }

   public final void n5(int[] var1, y2 var2) {
      this.a6.l6(var2.n3(), var1);
      this.u3 = this.u3 - var2.t2() * var2.l6();
      if (this.u3 == 0) {
         e2 var3 = new e2();

         try {
            this.a6.n5(var3);
            byte[] var4 = var3.toArray();
            this.n5.n5(var4, var4.length);
            this.n5.n5(this.l6);
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      }
   }

   @Override
   protected void a6() {
      if (this.a6 != null) {
         this.a6.dispose();
         this.a6 = null;
      }

      super.a6();
   }
}
