package com.aspose.slides.internal.w8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class s0 extends s7 {
   private List<v8> n5 = new List<>();

   public s0(o5 var1, String var2) {
      for (com.aspose.slides.internal.j3.z3 var3 = var1.t4(); var3 != null; var3 = var3.m1()) {
         if (d1.a6(var3.a6(), var2)) {
            this.n5.addItem((v8)var3);
         }
      }
   }

   @Override
   public int n5() {
      return this.n5.size();
   }

   @Override
   public IGenericEnumerator<com.aspose.slides.internal.j3.z8> iterator() {
      return new s0$n5(this.n5);
   }

   @Override
   public com.aspose.slides.internal.f5.r4 n5(String var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            v8 var3 = (v8)var2.next();
            String var4 = var3.u3("ID");
            if (var4 != null && d1.u3(var4, var1, (short)5)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var14 = this.n5.iterator();

      try {
         while (var14.hasNext()) {
            v8 var15 = (v8)var14.next();
            String var5 = var15.u3("NAME");
            if (var5 != null && d1.u3(var5, var1, (short)5)) {
               return var15;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      return null;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 n5(int var1) {
      return this.n5.get_Item(var1);
   }
}
