package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlException;
import java.util.UUID;

public class CustomXmlPart implements ICustomXmlPart {
   private Presentation n5;
   private com.aspose.slides.internal.q7.c8 l6;
   private com.aspose.slides.ms.System.o0 k5 = new com.aspose.slides.ms.System.o0();
   private String[] u3;
   private List<CustomXmlPartCollection> a6;

   @Override
   public final byte[] getXmlData() {
      return this.l6.n5();
   }

   @Override
   public final void setXmlData(byte[] value) {
      if (value == null) {
         throw new ArgumentNullException("Xml data can't be null");
      }

      this.u3 = n5(this.n5, value);
      this.l6 = this.n5.w1().n5(value);
   }

   @Override
   public final String getXmlAsString() {
      return com.aspose.slides.internal.l7h.j5.z3().l6(this.l6.n5());
   }

   @Override
   public final void setXmlAsString(String value) {
      if (value == null) {
         throw new ArgumentNullException("Xml string can't be null");
      }

      if (com.aspose.slides.ms.System.d1.a6(value, com.aspose.slides.ms.System.d1.n5)) {
         throw new ArgumentException("Xml string can't be empty");
      }

      this.setXmlData(com.aspose.slides.internal.l7h.j5.z3().u3(value));
   }

   @Override
   public final UUID getItemId() {
      return com.aspose.slides.ms.System.o0.n5(this.n5());
   }

   com.aspose.slides.ms.System.o0 n5() {
      return this.k5;
   }

   @Override
   public final void setItemId(UUID value) {
      this.n5(com.aspose.slides.ms.System.o0.n5(value));
   }

   void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.k5);
   }

   @Override
   public final String[] getNamespaceSchemas() {
      return this.u3;
   }

   final void n5(String[] var1) {
      this.u3 = var1;
   }

   @Override
   public final void remove() {
      if (this.n5 == null) {
         throw new PptxEditException("Custom xml part is already removed from parent collection");
      }

      this.n5 = null;
      CustomXmlPartCollection[] var1 = (CustomXmlPartCollection[])this.a6.toArray(new CustomXmlPartCollection[0]);

      for (CustomXmlPartCollection var5 : var1) {
         this.l6(var5);
      }
   }

   CustomXmlPart(Presentation parentImmediate, byte[] data) {
      this(parentImmediate, data, com.aspose.slides.ms.System.o0.l6().k5(), n5(parentImmediate, data));
   }

   CustomXmlPart(Presentation parentImmediate, byte[] data, com.aspose.slides.ms.System.o0 itemId, String[] schemas) {
      this.n5 = parentImmediate;
      this.l6 = this.n5.w1().n5(data);
      com.aspose.slides.ms.System.o0.l6().k5(this.k5);
      this.u3 = schemas;
      this.a6 = new List<>();
      this.n5(parentImmediate.q0());
   }

   final void n5(CustomXmlPartCollection var1) {
      var1.n5().addItem(this);
      this.a6.addItem(var1);
   }

   final boolean l6(CustomXmlPartCollection var1) {
      var1.n5().removeItem(this);
      boolean var2 = this.a6.removeItem(var1);
      if (this.a6.size() == 1) {
         CustomXmlPartCollection var3 = this.a6.get_Item(0);
         if (com.aspose.slides.internal.v6g.k5.l6(var3.getParent_Immediate(), Presentation.class)) {
            var3.n5().removeItem(this);
            this.a6.removeItem(var3);
         }
      }

      return var2;
   }

   private static String[] n5(IPresentation var0, byte[] var1) {
      com.aspose.slides.internal.c8m.d9 var2 = new com.aspose.slides.internal.c8m.d9();
      com.aspose.slides.internal.c8m.j8 var3 = var2.n5("/customXml/item1.xml", null, new com.aspose.slides.internal.c8m.d2(), var1);
      v2c var4 = new v2c(var3, new t5w(var0, InterruptionToken.getNone()));
      List var5 = new List();

      try {
         var4.n5(var5);
      } catch (XmlException var7) {
         throw new ArgumentException("Xml data is not valid", var7);
      }

      return (String[])var5.toArray(new String[0]);
   }
}
