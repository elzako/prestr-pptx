package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import java.io.InputStream;

public class CustomXmlPartCollection implements ICustomXmlPartCollection, r0g {
   private final r0g n5;
   private final List<ICustomXmlPart> l6;

   @Override
   public final ICustomXmlPart get_Item(int index) {
      if (index >= 0 && index < this.l6.size()) {
         return this.l6.get_Item(index);
      } else {
         throw new IndexOutOfRangeException("Index can't be less than zero or equal to or greater than Count");
      }
   }

   @Override
   public final int size() {
      return this.l6.size();
   }

   @Override
   public final ICustomXmlPart add(String xmlString) {
      if (xmlString == null) {
         throw new ArgumentNullException("xmlString", "XmlString can't be null");
      }

      if ("".equals(xmlString)) {
         throw new ArgumentException("xmlString", "XmlString can't be empty");
      }

      byte[] var2 = com.aspose.slides.internal.l7h.j5.z3().u3(xmlString);
      return this.add(var2);
   }

   @Override
   public final ICustomXmlPart add(byte[] xmlData) {
      if (xmlData == null) {
         throw new ArgumentNullException("xmlData", "XmlData can't be null");
      }

      CustomXmlPart var2 = new CustomXmlPart(this.l6(), xmlData);
      var2.n5(this);
      return var2;
   }

   @Override
   public final ICustomXmlPart add(InputStream inputStream) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(inputStream));
   }

   ICustomXmlPart n5(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("inputStream", "Input stream can't be null");
      }

      long var2 = var1.getLength();
      byte[] var4 = new byte[(int)var2];
      int var5 = 0;

      while (var5 < var2) {
         var5 += var1.read(var4, var5, com.aspose.slides.ms.System.z3.h0(var2) - var5);
      }

      return this.add(var4);
   }

   @Override
   public final void removeAt(int index) {
      if (index >= 0 && index < this.l6.size()) {
         ((CustomXmlPart)this.l6.get_Item(index)).l6(this);
      } else {
         throw new IndexOutOfRangeException("Index can't be less than zero or equal to or greater than Count");
      }
   }

   @Override
   public final boolean remove(ICustomXmlPart item) {
      if (item == null) {
         throw new ArgumentNullException("item", "Item can't be null");
      } else {
         return ((CustomXmlPart)item).l6(this);
      }
   }

   @Override
   public final void clear() {
      ICustomXmlPart[] var1 = this.l6.toArray(new ICustomXmlPart[0]);

      for (ICustomXmlPart var5 : var1) {
         ((CustomXmlPart)var5).l6(this);
      }
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.l6.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final IGenericEnumerator<ICustomXmlPart> iterator() {
      return this.l6.iterator();
   }

   @Override
   public final IGenericEnumerator<ICustomXmlPart> iteratorJava() {
      return this.l6.iteratorJava();
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   CustomXmlPartCollection(r0g parentImmediate) {
      this.n5 = parentImmediate;
      this.l6 = new List<>();
   }

   final List<ICustomXmlPart> n5() {
      return this.l6;
   }

   private Presentation l6() {
      r0g var1 = this.n5;

      while (var1 != null && !com.aspose.slides.internal.v6g.k5.l6(var1, Presentation.class)) {
         var1 = var1.getParent_Immediate();
      }

      return com.aspose.slides.internal.v6g.k5.n5(var1, Presentation.class);
   }
}
