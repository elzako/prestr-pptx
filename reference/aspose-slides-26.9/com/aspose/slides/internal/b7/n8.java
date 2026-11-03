package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

public class n8 implements IGenericEnumerable<o8> {
   private final List<o8> n5 = new List<>();

   public int n5() {
      return this.n5.size();
   }

   public void n5(o8 var1) {
      if (null == var1) {
         throw new ArgumentNullException("value");
      }

      this.n5.addItem(var1);
   }

   public void l6() {
      this.n5.clear();
   }

   public o8 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   @Override
   public IGenericEnumerator<o8> iterator() {
      return this.n5.iterator();
   }
}
