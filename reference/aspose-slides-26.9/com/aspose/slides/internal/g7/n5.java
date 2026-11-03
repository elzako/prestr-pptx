package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;

public class n5 extends z1 implements x6 {
   private a1 a6;
   private Stack<Double> u9;

   public n5(u7 var1, z1 var2) {
      super(var1, var2);
      super.l6 = new byte[0][];
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("\r\n"), com.aspose.slides.internal.l7h.j5.e2().u3("\r"), com.aspose.slides.internal.l7h.j5.e2().u3("\n")
      };
      List var3 = new List();
      var3.addItem(new q3(this, var1.n5()));
      var3.addItem(new l6(var1, this));
      var3.addItem(new l6(var1, this));
      super.n5(var3.toArray(new t9[0]));
   }

   public final a1 n5() {
      return this.a6;
   }

   @Override
   public final Stack<Double> l6() {
      return this.u9;
   }

   @Override
   public void k5() {
      this.a6 = new a1();
      this.u9 = new Stack<>();
      ((q3)super.c8()[0]).n5(true);
      super.k5();
   }

   @Override
   protected boolean n5(int var1, byte[][] var2, int[] var3) {
      var3[0] = var1;
      var2[0] = new byte[0];
      return true;
   }

   @Override
   protected void n5(int var1) {
      super.n5(var1);
   }

   @Override
   public void n5(Object var1) {
      q3 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, q3.class)) != null) {
         this.a6.n5(var2.n5());
      } else {
         l6 var3;
         if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, l6.class)) != null) {
            this.a6.n5((Object)var3.n5());
            this.a6.n5(0);
         }
      }

      super.n5(var1);
   }
}
