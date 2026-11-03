package com.aspose.slides.internal.f1s;

import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.q1;

public class t9 extends s7 {
   private byte[] u3;
   private int a6;
   private int u9;
   private boolean h0;
   private com.aspose.slides.internal.w0.c8 c8;
   private int t2;
   private int s7;

   public t9(com.aspose.slides.internal.z4.c8 var1, com.aspose.slides.internal.w0.y4 var2) {
      super(var1);
      com.aspose.slides.internal.o9b.l6 var3 = null;
      com.aspose.slides.internal.o9b.l6[] var4 = new com.aspose.slides.internal.o9b.l6[]{var3};
      boolean var5 = this.h0().n5(var2.l6(), var4);
      var3 = var4[0];
      com.aspose.slides.internal.j7.n5 var6 = var5 ? new com.aspose.slides.internal.j7.a6(var2) : new com.aspose.slides.internal.j7.n5(var2);

      try {
         if (var6.u9() != 4 && var6.u9() != 5) {
            com.aspose.slides.internal.z0k.e2 var7 = new com.aspose.slides.internal.z0k.e2();
            var6.n5(var7, 5);
            this.u3 = t4.l6(var7);
         } else {
            this.u3 = var2.l6();
         }

         if (com.aspose.slides.internal.j7.n5.l6(var6.c8())) {
            this.u3 = this.n5(this.u3);
         }

         this.a6 = var6.l6();
         this.u9 = var6.k5();
         this.h0 = true;
         this.c8 = var2.n3();
         if (var2.y4() == 4) {
            this.t2 = com.aspose.slides.internal.v6g.k5.u3(q1.n5((float)(var1.t9().h0().a6()), (float)(this.a6)) * 2.0F, 13);
            this.s7 = com.aspose.slides.internal.v6g.k5.u3(q1.n5((float)(var1.t9().h0().u9()), (float)(this.u9)) * 2.0F, 13);
         } else {
            this.t2 = this.a6;
            this.s7 = this.u9;
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   public t9(com.aspose.slides.internal.z4.c8 var1, com.aspose.slides.internal.w0.a6 var2) {
      super(var1);
      this.u3 = this.n5(com.aspose.slides.internal.s5.u9.n5(var2));
      this.t2 = this.a6 = 8;
      this.s7 = this.u9 = 8;
   }

   @Override
   public void l6(com.aspose.slides.internal.z4.t4 var1) {
      super.l6(var1);
      var1.n5("/PaintType", 1);
      var1.n5("/TilingType", 3);
      var1.n5("/BBox", new y1(0.0F, 0.0F, this.a6, this.u9));
      var1.n5("/XStep", this.t2);
      var1.n5("/YStep", this.s7);
      var1.n5("/Resources");
      var1.c8();
      this.n5.l6(var1);
      var1.t2();
      this.k5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.z4.t4 var1) {
      this.k5.n5(this.u3, null, new y1(0.0F, 0.0F, this.a6, this.u9), null, this.h0);
      super.n5(var1);
   }

   @Override
   protected int n5() {
      return 1;
   }

   @Override
   protected com.aspose.slides.internal.w0.c8 l6() {
      return this.c8;
   }

   private byte[] n5(byte[] var1) {
      if (this.h0().l6().q0() || this.h0().l6().t4() == null) {
         com.aspose.slides.internal.j7.n5 var2 = new com.aspose.slides.internal.j7.n5(var1);

         try {
            var2.n5(this.h0().l6().t4());
            com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

            try {
               if (var2.u9() == 4) {
                  var2.n5(var3, 4);
               } else {
                  var2.n5(var3, 5);
               }

               var1 = var3.toArray();
            } finally {
               if (var3 != null) {
                  var3.dispose();
               }
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      }

      return var1;
   }
}
