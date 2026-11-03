package com.aspose.slides.internal.o9n;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.r1x.w2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

class a6$n5 implements com.aspose.slides.internal.b8u.e2 {
   private final com.aspose.slides.internal.b8u.x8 n5;
   private final long l6;
   private final com.aspose.slides.internal.v6s.u3 k5;
   private final a6 u3;

   public a6$n5(com.aspose.slides.internal.v6s.u3 var1, com.aspose.slides.internal.b8u.x8 var2, long var3, a6 var5) {
      this.k5 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.u3 = var5;
   }

   @Override
   public final void n5(y2 var1) {
      com.aspose.slides.internal.l1f.n5 var2 = new com.aspose.slides.internal.l1f.n5();
      q0 var3 = null;

      try {
         v3 var4 = this.k5.k5(this.l6);

         try {
            var3 = (q0)var2.n5(var4, null);
            int[] var5 = var3.k5(var1.n3());
            this.n5.n5(var1.n3(), var5, new j5(var1.s7(), var1.x8()), new j5(var1.u9(), var1.n5()));
         } catch (com.aspose.slides.internal.z3b.k5 var27) {
            if (com.aspose.slides.internal.v6g.k5.l6(var27.getInnerException(), com.aspose.slides.internal.h6t.l6.class)) {
               com.aspose.slides.internal.h6t.l6 var6 = com.aspose.slides.internal.v6g.k5.n5(var27.getInnerException(), com.aspose.slides.internal.h6t.l6.class);
               if (var6.n5() == 1) {
                  Dictionary var7 = var2.n5();
                  List var8 = com.aspose.slides.internal.l1f.n5.n5((byte)-38, var7);
                  if (var8 == null || var8.size() == 0) {
                     v3 var9 = this.n5(var4, (byte)-38, var6.l6());

                     try {
                        if (var9 != null) {
                           var2 = new com.aspose.slides.internal.l1f.n5();
                           var3 = (q0)var2.n5(var9, null);
                           int[] var10 = var3.k5(var1.n3());
                           this.n5.n5(var1.n3(), var10, new j5(var1.s7(), var1.x8()), new j5(var1.u9(), var1.n5()));
                           return;
                        }
                     } finally {
                        if (var9 != null) {
                           var9.dispose();
                        }
                     }
                  }
               }
            }

            throw var27;
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private v3 n5(v3 var1, byte var2, com.aspose.slides.internal.b7s.n3[] var3) {
      w2 var4 = null;
      switch (var2) {
         case -38:
            if (this.u3.t9() != 0 && this.u3.e2() != 0 && a6.n5(this.u3) != null && a6.l6(this.u3) != null) {
               v3 var5 = new v3(new com.aspose.slides.internal.z0k.e2(), true);
               com.aspose.slides.internal.v6s.l6 var6 = new com.aspose.slides.internal.v6s.l6(var5);
               int var7 = 1;
               int var8 = 1;
               if (var3 != null) {
                  for (com.aspose.slides.internal.b7s.n3 var12 : var3) {
                     var7 = q1.n5(var12.u3(), var7);
                     var8 = q1.n5(var12.n3(), var8);
                  }
               }

               int var28 = com.aspose.slides.internal.n5p.h0.n5(this.u3.n3(), var7 * 8);
               int var29 = com.aspose.slides.internal.n5p.h0.n5(this.u3.y4(), var8 * 8);
               int var30 = this.u3.z1() == 0 ? var28 * var29 : this.u3.z1();
               byte[] var31 = new byte[]{-1, -35};
               var6.n5(var31);
               var6.l6(4);
               var6.l6(var30 & 65535);
               List var13 = new List();
               var13.addItem(new byte[]{-1, -48});
               var13.addItem(new byte[]{-1, -47});
               var13.addItem(new byte[]{-1, -46});
               var13.addItem(new byte[]{-1, -45});
               var13.addItem(new byte[]{-1, -44});
               var13.addItem(new byte[]{-1, -43});
               var13.addItem(new byte[]{-1, -42});
               var13.addItem(new byte[]{-1, -41});
               long[] var14 = a6.k5(this.u3);
               long[] var15 = a6.u3(this.u3);
               byte var16 = 0;
               byte var17 = 7;
               int var18 = var14.length;
               v3 var19 = this.k5.k5(0L);

               for (int var20 = 0; var20 < var18; var20++) {
                  int var21 = (int)var14[var20];
                  int var22 = (int)var15[var20];
                  byte[] var23 = new byte[var22];
                  synchronized (var19.n5()) {
                     var19.n5(var21);
                     int var25 = var19.n5(var23, 0, var22);
                     if (var22 != var25) {
                        throw new com.aspose.slides.internal.z3b.k5(
                           d1.n5("Failed to read strip data. Bytes read = {0} from {1}",new Object[]{ var25, var22}),
                           new com.aspose.slides.internal.z3b.a6("Failed to reconstruct JPEG scan data segment")
                        );
                     }
                  }

                  var6.n5(var23);
                  if (var20 != var18 - 1) {
                     var6.n5((byte[])var13.get_Item(var16));
                  }

                  var16 = (byte)(var16 == 7 ? 0 : var16 + 1);
               }

               var4 = new w2(var1, true);
               var4.n5(a6.a6(this.u3), var5, true);
            }
         default:
            return var4;
      }
   }
}
