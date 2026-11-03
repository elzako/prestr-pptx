package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a5 extends r4 {
   private static final int[] n5 = new int[]{
      4040,
      Integer.MAX_VALUE,
      2005,
      Integer.MAX_VALUE,
      4004,
      Integer.MAX_VALUE,
      4005,
      Integer.MAX_VALUE,
      4011,
      Integer.MAX_VALUE,
      4009,
      Integer.MAX_VALUE,
      4003,
      Integer.MAX_VALUE
   };

   public a5() {
      this.w1().n5(1010);
   }

   public final c7 l6() {
      return (c7)this.k5(4040);
   }

   public final e0 u3() {
      return (e0)this.k5(2005);
   }

   public final n2z a6() {
      return (n2z)this.k5(4004);
   }

   public final g2x u9() {
      return (g2x)this.k5(4005);
   }

   public final d5 h0() {
      return (d5)this.k5(4011);
   }

   public final r7n c8() {
      return (r7n)this.k5(4009);
   }

   public final o6t t2() {
      return (o6t)this.k5(4003);
   }

   public final List<o6t> s7() {
      List var1 = new List();
      List var2 = n5(this, 4003);
      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            o6t var4 = (o6t)var3.next();
            var1.addItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
