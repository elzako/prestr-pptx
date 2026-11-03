package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;

public class s4 implements IGenericCollection<Object>, IGenericEnumerable<Object> {
   private h6 n5;
   private h6 l6;
   private final Object k5 = new Object();

   @Override
   public final int size() {
      int var1 = 0;

      for (h6 var2 = this.n5; var2 != null; var2 = var2.l6()) {
         var1++;
      }

      return var1;
   }

   @Override
   public final boolean isReadOnly() {
      return false;
   }

   public final void n5(Object var1) {
      if (this.n5()) {
         h6 var2 = new h6(var1);
         this.l6 = var2;
         this.n5 = var2;
      } else {
         this.n5 = new h6(var1, this.n5);
      }
   }

   public final void l6(Object var1) {
      if (this.n5()) {
         h6 var2 = new h6(var1);
         this.l6 = var2;
         this.n5 = var2;
      } else {
         this.l6.n5(new h6(var1));
         this.l6 = this.l6.l6();
      }
   }

   public final boolean n5() {
      return this.n5 == null;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(
         !this.n5() ? com.aspose.slides.ms.System.d1.n5("[{0}] = {{\n", new Object[]{this.size()}) : com.aspose.slides.ms.System.d1.n5
      );

      for (h6 var2 = this.n5; var2 != null; var2 = var2.l6()) {
         var1.l6(var2.n5().toString());
      }

      if (!this.n5()) {
         var1.n5("}");
      }

      return var1.toString();
   }

   @Override
   public final IGenericEnumerator<Object> iterator() {
      return new s4$n5(this);
   }

   @Override
   public final void addItem(Object item) {
      throw new NotImplementedException();
   }

   @Override
   public final void clear() {
      throw new NotImplementedException();
   }

   @Override
   public final boolean containsItem(Object item) {
      throw new NotImplementedException();
   }

   @Override
   public final boolean removeItem(Object item) {
      throw new NotImplementedException();
   }

   @Override
   public void copyToTArray(Object[] arg0, int arg1) {
      throw new NotImplementedException();
   }

   // $VF: synthetic method
   static h6 n5(s4 var0) {
      return var0.n5;
   }
}
