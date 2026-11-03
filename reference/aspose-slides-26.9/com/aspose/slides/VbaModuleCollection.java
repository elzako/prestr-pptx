package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

public final class VbaModuleCollection implements IVbaModuleCollection {
   private final List<IVbaModule> n5 = new List<>();
   private final VbaProject l6;

   VbaModuleCollection(VbaProject vbaProject) {
      this.l6 = vbaProject;
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   final void n5(IVbaModule var1) {
      this.n5.addItem(var1);
   }

   @Override
   public final void remove(IVbaModule value) {
      if (this.n5.containsItem(value)) {
         this.l6.l6(value.getName());
         this.n5.removeItem(value);
      }
   }

   @Override
   public final IVbaModule addEmptyModule(String name) {
      if (com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(name))) {
         throw new ArgumentException("Name should not be an empty string", "name");
      }

      if (this.n5.find(new VbaModuleCollection$1(this, name)) != null) {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5("Module with name {0} already exists", new Object[]{name}));
      }

      VbaModule var2 = this.l6.n5(name);
      this.n5.addItem(var2);
      return var2;
   }

   @Override
   public final IVbaModule get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IVbaModule> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IVbaModule> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}
