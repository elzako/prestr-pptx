package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.u3;

@j3
public class NameObjectCollectionBase$KeysCollection implements ICollection, IEnumerable {
   private NameObjectCollectionBase n5;

   NameObjectCollectionBase$KeysCollection(NameObjectCollectionBase collection) {
      this.n5 = collection;
   }

   public String get(int index) {
      return this.n5.baseGetKey(index);
   }

   @Override
   public void copyTo(u3 array, int arrayIndex) {
      ArrayList var3 = NameObjectCollectionBase.n5(this.n5);
      if (null == array) {
         if (this.n5 != null && this.n5.size() > 0) {
            throw new ArgumentNullException("array");
         }
      } else {
         if (arrayIndex < 0) {
            throw new ArgumentOutOfRangeException("arrayIndex");
         }

         if (array.a6() > 0 && arrayIndex >= array.a6()) {
            throw new ArgumentException("arrayIndex is equal to or greater than array.Length");
         }

         if (arrayIndex + var3.size() > array.a6()) {
            throw new ArgumentException("Not enough room from arrayIndex to end of array for this KeysCollection");
         }

         if (array != null && array.u3() > 1) {
            throw new ArgumentException("array is multidimensional");
         }

         Object[] var4 = (Object[])u3.n5(array);

         for (int var5 = 0; var5 < var3.size(); arrayIndex++) {
            var4[arrayIndex] = ((NameObjectCollectionBase$_Item)var3.get_Item(var5)).n5;
            var5++;
         }
      }
   }

   @Override
   public boolean isSynchronized() {
      return false;
   }

   @Override
   public Object getSyncRoot() {
      return this.n5;
   }

   @Override
   public int size() {
      return this.n5.size();
   }

   public String get_Item(int index) {
      return this.get(index);
   }

   @Override
   public IEnumerator iterator() {
      return new NameObjectCollectionBase$_KeysEnumerator(this.n5);
   }
}
