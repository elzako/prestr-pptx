package com.aspose.slides.internal.s4;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.f5.r4;
import com.aspose.slides.ms.System.IDisposable;

public class l6 {
   private final List<r4> n5;
   private final r4 l6;
   private final n5 k5;
   private final int u3;
   private boolean a6;
   private boolean u9;

   public l6(r4 var1, n5 var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("target");
      }

      if (var2 == null) {
         throw new ArgumentNullException("event");
      }

      this.n5 = new List<>();
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6();
   }

   public final void n5() {
      this.a6 = true;
   }

   public final void l6() {
      this.u9 = true;
   }

   public final boolean k5() {
      return this.u9;
   }

   public final boolean u3() {
      return (this.u3 == 2 || this.u3 == 1) && !this.n5(1) ? false : this.u3 != 2 && this.u3 != 0 || this.n5(0);
   }

   private boolean n5(int var1) {
      List var2 = var1 == 1 ? new List<>(this.n5) : this.n5;
      if (var1 == 1) {
         var2.reverse();
      }

      List$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            r4 var4 = (r4)var3.next();
            IGenericCollection var5 = var4.n5(this.k5, var1);
            if (var5.size() > 0) {
               this.k5.n5(var4);
            }

            IGenericEnumerator var6 = var5.iterator();

            try {
               while (var6.hasNext()) {
                  com.aspose.slides.internal.n1.l6 var7 = (com.aspose.slides.internal.n1.l6)var6.next();
                  if (!this.n5(var7)) {
                     return false;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return true;
   }

   public final boolean n5(com.aspose.slides.internal.n1.l6 var1) {
      var1.n5(this.k5);
      return !this.a6;
   }

   private void a6() {
      this.n5(this.l6);

      for (r4 var1 = this.l6.y2(); var1 != null; var1 = var1.y2()) {
         this.n5(var1);
      }
   }

   private void n5(r4 var1) {
      if (var1.l6(this.k5)) {
         this.n5.addItem(var1);
      }
   }
}
