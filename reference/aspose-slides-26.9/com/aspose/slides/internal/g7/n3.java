package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;

public class n3 extends z1 implements x6 {
   private s7 a6;
   private List<Byte> u9;
   private Stack<Double> h0;

   public n3(u7 var1, z1 var2) {
      super(var1, var2);
      super.l6 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("dup")};
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("|\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("|\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("NP\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("NP\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("put\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("put\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("put")
      };
      super.n5(new t9[]{new q2(this, var1.n5()), new y6(this, var1.n5()), new w6(var1, this)});
   }

   @Override
   public final Stack<Double> l6() {
      return this.h0;
   }

   public final s7 n5() {
      return this.a6;
   }

   @Override
   public void k5() {
      this.h0 = new Stack<>();
      this.a6 = new s7();
      this.u9 = new List<>();
      super.k5();
   }

   @Override
   protected byte[] n5(int var1, int[] var2) {
      byte[] var3 = super.n5(var1, var2);
      if (var3 != null) {
         if (!z8.n5(var3, com.aspose.slides.internal.l7h.j5.e2().u3("|\r"))
            && !z8.n5(var3, com.aspose.slides.internal.l7h.j5.e2().u3("|\n"))
            && !z8.n5(var3, com.aspose.slides.internal.l7h.j5.e2().u3("NP\r"))
            && !z8.n5(var3, com.aspose.slides.internal.l7h.j5.e2().u3("NP\n"))) {
            this.a6.l6(2);
         } else {
            this.a6.l6(3);
         }
      }

      return var3;
   }

   @Override
   protected void n5(int var1) {
      this.u9.addItem(this.u3[var1]);
      super.n5(var1);
   }

   @Override
   public void n5(Object var1) {
      q2 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, q2.class)) != null) {
         if (this.a6.l6() == Integer.MIN_VALUE) {
            this.a6.n5(com.aspose.slides.internal.v6g.k5.u3(var2.n5(), 14));
         }

         this.l6().push(var2.n5());
      } else {
         w6 var3;
         if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, w6.class)) != null) {
            this.a6.n5(var3.t4());
         } else {
            y6 var4;
            if ((var4 = com.aspose.slides.internal.v6g.k5.n5(var1, y6.class)) != null) {
               this.a6.n5(com.aspose.slides.internal.l7h.j5.e2().u3(var4.n5()));
            }
         }
      }

      super.n5(var1);
   }
}
