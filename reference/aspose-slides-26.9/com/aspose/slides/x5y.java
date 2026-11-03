package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class x5y implements y9i {
   private final List<y9i> n5;
   private final String l6;

   public final String n5() {
      return this.l6;
   }

   public final IGenericEnumerable<y9i> l6() {
      return this.n5;
   }

   public x5y(String var1) {
      this.l6 = var1;
      this.n5 = new List<>();
   }

   @Override
   public final x5r n5(t8 var1) {
      List var2 = new List(this.n5.size());
      IGenericEnumerator var3 = this.l6().iterator();

      try {
         while (var3.hasNext()) {
            y9i var4 = (y9i)var3.next();
            var2.addItem(var4.n5(var1).u3());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return t2e.n5(this.n5(), var2, var1);
   }

   public final void n5(y9i var1) {
      this.n5.addItem(var1);
   }

   @Override
   public final String n5(y9w var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(this.n5());
      var2.n5('(');
      IGenericEnumerator var3 = this.l6().iterator();

      try {
         while (var3.hasNext()) {
            y9i var4 = (y9i)var3.next();
            var2.n5("{0}, ",new Object[]{ var4.n5(var1)});
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (this.n5.size() > 0) {
         var2.l6(var2.l6() - 2, 2);
      }

      var2.n5(')');
      return var2.toString();
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(this.n5());
      var1.n5('(');
      IGenericEnumerator var2 = this.l6().iterator();

      try {
         while (var2.hasNext()) {
            y9i var3 = (y9i)var2.next();
            var1.n5("{0}, ", var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (this.n5.size() > 0) {
         var1.l6(var1.l6() - 2, 2);
      }

      var1.n5(')');
      return var1.toString();
   }
}
