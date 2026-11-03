package com.aspose.slides.internal.u2w;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.r1x.i9;
import com.aspose.slides.internal.r1x.v3;

class u9$u3 extends u9$n5 {
   private boolean n5 = false;
   private int l6 = -1;

   public u9$u3(com.aspose.slides.internal.f2i.n5 var1, long var2, com.aspose.slides.internal.v6s.a6 var4, int var5, int var6) {
      super(var1, var2, var4, var5, var6);
   }

   @Override
   public long[] n5() {
      long[] var1 = new long[this.k5().n5().length];
      com.aspose.slides.ms.System.u3.n5(this.k5().n5(), 0, var1, 0, var1.length);
      var1[0] = (var1[0] & 4294967295L) + (this.u3() & 4294967295L) & 4294967295L;
      return var1;
   }

   @Override
   public long[] l6() {
      long[] var1 = new long[this.k5().l6().length];
      com.aspose.slides.ms.System.u3.n5(this.k5().l6(), 0, var1, 0, var1.length);
      var1[0] = (var1[0] & 4294967295L) - (this.u3() & 4294967295L) & 4294967295L;
      return var1;
   }

   private int u3() {
      if (!this.n5) {
         try {
            u9$a6 var1 = com.aspose.slides.internal.v6g.k5.n5(this.k5(), u9$a6.class);
            if (var1 != null) {
               com.aspose.slides.internal.l1f.n5 var2 = new com.aspose.slides.internal.l1f.n5();
               var1.u9().setPosition(0L);
               v3 var3 = null;

               try {
                  var3 = new v3(var1.u9());
                  q0 var4 = (q0)var2.n5(var3, null);

                  try {
                     Dictionary var5 = var2.n5();
                     List var6 = com.aspose.slides.internal.l1f.n5.n5((byte)-38, var5);
                     if (var6 != null && var6.size() != 0) {
                        this.l6 = (Integer)var6.get_Item(0);
                        this.n5 = true;
                     }
                  } finally {
                     if (var4 != null) {
                        var4.dispose();
                     }
                  }
               } finally {
                  i9 var9 = (i9)i9.n5();
                  var9.n5(var3);
               }
            }
         } catch (RuntimeException var18) {
            throw new com.aspose.slides.internal.z3b.k5("Failed to load JPEG image with old-style compression", var18);
         }
      }

      return this.l6;
   }
}
