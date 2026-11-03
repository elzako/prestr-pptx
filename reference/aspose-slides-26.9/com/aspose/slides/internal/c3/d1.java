package com.aspose.slides.internal.c3;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class d1 implements IGenericEnumerable<com.aspose.slides.internal.f5.z3> {
   private List<com.aspose.slides.internal.f5.z3> n5 = new List<>();
   private com.aspose.slides.internal.f5.z3 l6;

   public final void n5(com.aspose.slides.internal.f5.z3 var1) {
      this.l6 = var1;
      this.n5.addItem(var1);
   }

   public final com.aspose.slides.internal.f5.z3 n5() {
      com.aspose.slides.internal.f5.z3 var1 = this.l6;
      if (this.n5.size() > 0) {
         this.n5.removeAt(this.n5.size() - 1);
         this.l6 = this.n5.size() != 0 ? this.n5.get_Item(this.n5.size() - 1) : null;
      }

      return var1;
   }

   public final com.aspose.slides.internal.f5.z3 l6() {
      return this.l6;
   }

   public final int k5() {
      return this.n5.size();
   }

   public final com.aspose.slides.internal.f5.z3 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void n5(int var1, com.aspose.slides.internal.f5.z3 var2) {
      this.n5.set_Item(var1, var2);
      if (var1 == this.n5.size() - 1) {
         this.l6 = var2;
      }
   }

   public final com.aspose.slides.internal.f5.z3 u3() {
      return this.n5.size() != 0 ? this.n5.get_Item(0) : null;
   }

   public final boolean l6(com.aspose.slides.internal.f5.z3 var1) {
      if (this.n5.removeItem(var1)) {
         if (this.n5.size() != 0) {
            this.l6 = this.n5.size() != 0 ? this.n5.get_Item(this.n5.size() - 1) : null;
         }

         return true;
      } else {
         return false;
      }
   }

   public final boolean n5(com.aspose.slides.internal.f5.d2 var1) {
      IGenericEnumerator var2 = this.iterator();

      while (var2.hasNext()) {
         if (((com.aspose.slides.internal.f5.z3)var2.next()).u3().n5(var1)) {
            return true;
         }
      }

      return false;
   }

   public final int k5(com.aspose.slides.internal.f5.z3 var1) {
      return this.n5.indexOf(var1);
   }

   public final void l6(int var1, com.aspose.slides.internal.f5.z3 var2) {
      this.n5.insertItem(var1, var2);
      if (var1 == this.n5.size() - 1) {
         this.l6 = var2;
      }
   }

   public final com.aspose.slides.internal.f5.z3 u3(com.aspose.slides.internal.f5.z3 var1) {
      int var2 = this.k5(var1);
      return var2 < 1 ? null : this.n5(var2 - 1);
   }

   public final com.aspose.slides.internal.f5.z3 l6(com.aspose.slides.internal.f5.d2 var1) {
      IGenericEnumerator var2 = this.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.f5.z3 var3 = (com.aspose.slides.internal.f5.z3)var2.next();
            if (var3.u3().n5(var1)) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   @Override
   public final IGenericEnumerator<com.aspose.slides.internal.f5.z3> iterator() {
      return new com.aspose.slides.internal.i9.n5(this.n5);
   }
}
