package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.b7s.h2;
import com.aspose.slides.internal.b7s.y0;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.f5;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;

class a6$l6 implements com.aspose.slides.internal.b8u.e2, com.aspose.slides.internal.y7w.n5 {
   private final com.aspose.slides.internal.b8u.x8 n5;
   private final long l6;
   private final com.aspose.slides.internal.v6s.u3 k5;
   private final a6 u3;

   public a6$l6(com.aspose.slides.internal.v6s.u3 var1, com.aspose.slides.internal.b8u.x8 var2, long var3, a6 var5) {
      this.k5 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.u3 = var5;
   }

   @Override
   public final void n5(y2 var1) {
      com.aspose.slides.internal.y7w.l6 var2 = new com.aspose.slides.internal.y7w.l6(this.u3.u9(), a6.u9(this.u3), a6.h0(this.u3), this.n5);
      var2.n5(var1.n3(), this);
   }

   @Override
   public final int[] n5(int var1, int var2, int var3, y2 var4) {
      int var5 = var2 * a6.c8(this.u3);
      int var6 = var3 * a6.t2(this.u3);
      int var7 = (int)a6.s7(this.u3)[var1];
      int var8 = (int)a6.x8(this.u3)[var1];
      int var9 = f5.n5(this.u3.c8().y2());
      y0 var10 = new y0(this.k5.k5(0L).k5());

      try {
         h2 var11 = new h2(var10);
         com.aspose.slides.internal.b7s.t9 var12 = new com.aspose.slides.internal.b7s.t9(var11);
         var12.n5(
            new com.aspose.slides.internal.t3h.l6(
               var10, this.u3.c8(), a6.n3(this.u3), a6.y4(this.u3), var7, var8, new long[][]{a6.e2(this.u3), a6.t9(this.u3), a6.z1(this.u3)}
            )
         );
         z6 var13 = new z6();
         var13.n5(this.n5(var9));
         com.aspose.slides.internal.l3e.n5 var14 = new com.aspose.slides.internal.l3e.n5();
         var14.l6(var12);
         var14.n5(var13);
         com.aspose.slides.internal.b7s.y4 var15 = new com.aspose.slides.internal.b7s.y4(var14, a6.t4(this.u3));
         var15.n5(this.u3);
         var15.n5(new j5(var5, var6));
         var15.l6(var4.n3(), this.n5);
      } finally {
         if (var10 != null) {
            var10.dispose();
         }
      }

      return null;
   }

   private v4 n5(int var1) {
      switch (var1) {
         case 0:
            return v4.n3();
         case 1:
            return v4.x8();
         case 2:
            return v4.l6();
         case 3:
            return v4.y4();
         case 4:
         default:
            return v4.t9();
      }
   }
}
