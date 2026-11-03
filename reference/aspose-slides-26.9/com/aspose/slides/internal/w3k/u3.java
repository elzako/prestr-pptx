package com.aspose.slides.internal.w3k;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.z3;

public class u3 implements c8 {
   private final com.aspose.slides.internal.x5e.n5 n5;
   private final com.aspose.slides.internal.l4o.n5 l6;

   public u3(com.aspose.slides.internal.l4o.k5 var1, com.aspose.slides.internal.l4o.n5 var2) {
      this.l6 = var2;
      this.n5 = new com.aspose.slides.internal.x5e.n5(var1, var2.s7());
   }

   @Override
   public void n5(j5 var1, byte[] var2, z3 var3, z3 var4) {
      switch (this.l6.c8()) {
         case 0:
            com.aspose.slides.internal.y2o.l6 var7 = new com.aspose.slides.internal.y2o.l6(
               this.n5,
               this.l6.u3(com.aspose.slides.internal.v6g.k5.u3(this.l6.y4(), 10)),
               com.aspose.slides.internal.v6g.k5.u3(this.l6.u9(), 10),
               this.l6.t4(),
               this.l6.z1()
            );
            if (com.aspose.slides.internal.v6g.k5.u3(this.l6.l6(), 6) < 8) {
               k5 var6 = new k5(this.l6, var7);
               var6.n5(var1.n3(), var2, var3.u3(), var4.u3());
            } else {
               var7.n5(var1.n3(), var2, var3.u3(), var4.u3());
            }
            break;
         case 1:
            n5 var5 = new n5(this.n5, this.l6);
            var5.n5(var1.n3(), var2, var3.u3(), var4.u3());
            break;
         default:
            throw new com.aspose.slides.internal.d9m.n5("Unsupported png interlace mode.", new NotSupportedException());
      }
   }

   public void n5() {
      this.n5.n5();
   }
}
