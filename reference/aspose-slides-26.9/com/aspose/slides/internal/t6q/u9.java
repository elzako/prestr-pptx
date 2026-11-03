package com.aspose.slides.internal.t6q;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public final class u9 extends u3 implements n5 {
   private String l6;

   public u9(String var1) {
      this.l6(var1);
   }

   public u9() {
      this(null);
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   @Override
   public void n5(String var1, String var2) {
      if (!"xmlns:x".equals(var1) && !"adobe:ns:meta/".equals(var2)) {
         if (!"x:xmptk".equals(var1)) {
            super.n5(var1, var2);
         }
      }
   }

   @Override
   public final String n5() {
      a5 var1 = new a5();
      var1.n5("<{0} ",new Object[]{ "x:xmpmeta"});
      var1.n5("xmlns:x=\"{0}\" ",new Object[]{ "adobe:ns:meta/"});
      var1.n5("{0}=\"{1}\"",new Object[]{ "x:xmptk", this.l6()});
      Dictionary$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.n5(" {0}=\"{1}\" ",new Object[]{ var3.getKey(), var3.getValue()});
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.n5(">");
      var1.l6("{0}");
      var1.n5("</{0}>",new Object[]{ "x:xmpmeta"});
      return var1.toString();
   }

   public final boolean n5(u9 var1) {
      if (var1 == null) {
         return false;
      }

      boolean var2 = false;
      if (d1.n5(this.l6()) && d1.n5(var1.l6())) {
         var2 = true;
      } else if (!d1.n5(this.l6()) && !d1.n5(var1.l6())) {
         var2 = d1.u3(this.l6(), var1.l6(), (short)5);
      }

      if (!var2) {
         return false;
      }

      u3 var3 = this;
      return var3.n5(var1);
   }

   @Override
   public boolean equals(Object other) {
      if (other == null) {
         return false;
      } else if (j8.l6(this, other)) {
         return true;
      } else {
         return j8.n5(this) != j8.n5(other) ? false : this.n5(com.aspose.slides.internal.v6g.k5.n5(other, u9.class));
      }
   }

   @Override
   public int hashCode() {
      int var1 = 5;
      var1 *= super.hashCode();
      if (this.l6() != null) {
         var1 += this.l6().hashCode();
      }

      return var1;
   }
}
