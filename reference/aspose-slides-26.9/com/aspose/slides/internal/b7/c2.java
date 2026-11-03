package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ApplicationException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public class c2 extends f1 implements IGenericCloneable<c2> {
   private final List<d1> n5 = new List<>();
   private m8 l6;

   public m8 n5() {
      return this.l6 == null ? new m8(this.u9().n5(), this.u9().l6()) : this.l6;
   }

   public void n5(m8 var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      this.l6 = var1.k5();
   }

   public c2(z6e var1) {
      super(var1);
   }

   public c2 u3() {
      c2 var1 = new c2(this.u9());
      var1.l6 = this.l6.k5();
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            d1 var3 = (d1)var2.next();
            var1.n5.addItem(var3.l6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public void n5(double var1, double var3, int var5, boolean var6, boolean var7) {
      d1 var8 = new d1(var1, var3, var5, var6, var7);
      this.n5.addItem(var8);
   }

   public void a6(double var1, double var3) {
      d1 var5 = this.h0();
      var5.l6(var1, var3);
   }

   public void u9(double var1, double var3) {
      this.h0().n5(var1, var3);
   }

   public void n5(double var1, double var3, double var5, double var7) {
      this.h0().n5(var1, var3, var5, var7);
   }

   public void n5(k0 var1, k0 var2, k0 var3) {
      this.h0().n5(var1.u3(), var2.u3(), var3.u3());
   }

   public void n5(k0 var1, k0 var2) {
      this.h0().n5(var1.u3(), var2.u3());
   }

   public void a6() {
      this.h0().u3();
   }

   private d1 h0() {
      if (this.n5.size() == 0) {
         throw new ApplicationException("A Path object has not been added.");
      } else {
         return this.n5.get_Item(this.n5.size() - 1);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c2 cloneT() {
      return this.u3();
   }

}
