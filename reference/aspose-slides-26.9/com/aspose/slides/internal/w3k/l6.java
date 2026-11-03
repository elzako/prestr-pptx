package com.aspose.slides.internal.w3k;

import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.y2;
import com.aspose.slides.internal.y5s.z3;

public class l6 implements c8 {
   private final com.aspose.slides.internal.l4o.n5 n5;
   private final c8 l6;
   private int k5;
   private j5 u3 = new j5();
   private byte[] a6;

   public l6(com.aspose.slides.internal.l4o.n5 var1, c8 var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = new j5(new z3(), new y2(com.aspose.slides.internal.v6g.k5.u3(this.n5.y4(), 10), com.aspose.slides.internal.v6g.k5.u3(this.n5.u9(), 10)));
   }

   @Override
   public void n5(j5 var1, byte[] var2, z3 var3, z3 var4) {
      if (var1.a6() == this.u3.a6() && var1.u9() == this.u3.u9()) {
         this.l6.n5(var1.n3(), var2, var3.u3(), var4.u3());
      } else {
         if (this.a6 == null) {
            try {
               this.a6 = new byte[this.u3.u9() * this.n5.t4() * this.u3.a6()];
            } catch (OutOfMemoryError var6) {
               throw new com.aspose.slides.internal.d9m.n5("Not enough memory to process image.", var6);
            }
         }

         for (int var5 = 0; var5 < var1.u9(); var5++) {
            System.arraycopy(
               var2, var5 * this.n5.u3(this.u3.a6()), this.a6, (var1.c8() + var5) * this.n5.u3(this.u3.a6()) + this.n5.u3(var1.h0()), this.n5.u3(this.u3.a6())
            );
         }

         this.k5 += var2.length;
         if (this.k5 == this.a6.length) {
            this.l6
               .n5(
                  this.u3.n3(),
                  this.a6,
                  new z3(),
                  new z3(com.aspose.slides.internal.v6g.k5.u3(this.n5.y4(), 10), com.aspose.slides.internal.v6g.k5.u3(this.n5.u9(), 10))
               );
         }
      }
   }
}
