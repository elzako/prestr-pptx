package com.aspose.slides.internal.t6q;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class s7 {
   private a6 n5;
   private u9 l6;
   private n3 k5;
   private x8 u3;
   private c8 a6;

   public s7(a6 var1, n3 var2, u9 var3) {
      this.n5(var1);
      this.n5(var2);
      this.n5(var3);
      this.n5(new x8());
      this.n5(new c8());
   }

   public s7() {
      this(new a6(), new n3(), null);
   }

   public final a6 n5() {
      return this.n5;
   }

   public final void n5(a6 var1) {
      this.n5 = var1;
   }

   public final u9 l6() {
      return this.l6;
   }

   public final void n5(u9 var1) {
      this.l6 = var1;
   }

   public final n3 k5() {
      return this.k5;
   }

   public final void n5(n3 var1) {
      this.k5 = var1;
   }

   public final h0[] u3() {
      return this.h0().n5();
   }

   final x8 a6() {
      return this.u3;
   }

   public final void n5(x8 var1) {
      this.u3 = var1;
   }

   private c8 h0() {
      return this.a6;
   }

   private void n5(c8 var1) {
      this.a6 = var1;
   }

   public final void n5(h0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("package");
      }

      if (this.l6(var1.u3())) {
         throw new ArgumentException("Package is already exist. Use GetPackage method before", "package");
      }

      this.h0().n5(var1);
   }

   public final h0 n5(String var1) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("namespaceUri");
      } else {
         return this.h0().n5(var1);
      }
   }

   public final boolean l6(String var1) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("namespaceUri");
      }

      h0 var2 = this.n5(var1);
      return var2 != null;
   }

   public final String u9() {
      a5 var1 = new a5();
      if (this.n5() != null) {
         var1.n5(this.n5().n5());
         var1.n5('\n');
      }

      String var2 = this.a6().n5();
      if (this.l6() != null) {
         var2 = d1.n5(this.l6().n5(), new Object[]{var2});
      }

      a5 var3 = new a5();
      IGenericEnumerator var4 = this.h0().iterator();

      try {
         while (var4.hasNext()) {
            h0 var5 = (h0)var4.next();
            var3.n5("<{0} {1}{2}>",new Object[]{ "rdf:Description", var5.l6(), var5.u9()});
            var3.n5(var5.n5());
            var3.n5("</{0}>",new Object[]{ "rdf:Description"});
            var3.n5('\n');
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var1.n5(var2,new Object[]{ var3});
      if (this.k5() != null) {
         var1.n5('\n');
         var1.n5(this.k5().n5());
      }

      return var1.toString();
   }
}
