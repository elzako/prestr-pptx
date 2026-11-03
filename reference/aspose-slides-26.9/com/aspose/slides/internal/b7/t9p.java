package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public final class t9p implements IGenericCloneable<t9p> {
   private w1n n5;
   private o9 l6;
   private final List<g1p> k5 = new List<>();

   public t9p() {
      this.l6 = new o9();
   }

   public o9 n5() {
      return this.l6;
   }

   public void n5(o9 var1) {
      if (var1 != this.l6) {
         this.l6 = null != var1 ? var1.n3() : null;
      }
   }

   public g1p[] l6() {
      return this.k5.toArray(new g1p[0]);
   }

   public void n5(w1n var1) {
      if (var1 != this.n5) {
         this.n5 = null != var1 ? var1.c8() : null;
      }
   }

   public t9p k5() {
      return new t9p(this);
   }

   public void n5(g1p var1) {
      if (null == var1) {
         throw new ArgumentNullException("textRun");
      }

      this.k5.addItem(var1.l6());
   }

   private t9p(t9p var1) {
      this.n5(var1.l6);
      this.n5(var1.n5);
      List$Enumerator var2 = var1.k5.iterator();

      try {
         while (var2.hasNext()) {
            g1p var3 = (g1p)var2.next();
            this.k5.addItem(var3.l6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public t9p cloneT() {
      return this.k5();
   }

}
