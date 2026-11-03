package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import java.util.UUID;

public final class SensitivityLabelCollection extends DomObject<Presentation> implements ISensitivityLabelCollection {
   private com.aspose.slides.internal.k4y.h3k n5;
   private final List<ISensitivityLabel> l6 = new List<>();

   @Override
   public final ISensitivityLabel get_Item(int index) {
      return this.l6.get_Item(index);
   }

   @Override
   public final ISensitivityLabel add(String id, UUID siteId, boolean isEnabled, int methodType) {
      return this.n5(id, com.aspose.slides.ms.System.o0.n5(siteId), isEnabled, methodType);
   }

   ISensitivityLabel n5(String var1, com.aspose.slides.ms.System.o0 var2, boolean var3, int var4) {
      SensitivityLabel var5 = new SensitivityLabel(var1, var2.k5(), var3, var4);
      this.add(var5);
      return var5;
   }

   @Override
   public final int add(ISensitivityLabel label) {
      int var2 = this.l6.findIndex(new SensitivityLabelCollection$1(this, label));
      if (var2 == -1) {
         this.l6.addItem(label);
         return this.l6.size() - 1;
      } else {
         throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"The sensitivity label with Id ", label.getId(), " has already been added."}), "label");
      }
   }

   @Override
   public final void removeAt(int index) {
      this.l6.removeAt(index);
   }

   @Override
   public final void clear() {
      this.l6.clear();
   }

   @Override
   public final IGenericEnumerator<ISensitivityLabel> iterator() {
      return this.l6.iterator();
   }

   @Override
   public final int getCount() {
      return this.l6.size();
   }

   public final void copyTo(ISensitivityLabel[] array, int index) {
      this.l6.copyToTArray(array, index);
   }

   SensitivityLabelCollection(Presentation parentImmediate) {
      super(parentImmediate);
   }

   final com.aspose.slides.internal.k4y.h3k n5() {
      return this.n5;
   }

   final void n5(com.aspose.slides.internal.k4y.h3k var1) {
      this.n5 = var1;
   }
}
