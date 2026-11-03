package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.InvalidOperationException;

public class b2 extends l0 {
   private String n5;
   private String l6;
   private String k5;

   public b2(String var1, String var2, String var3, XmlDocument var4) {
      super(var4);
      this.k5 = var4.getNameTable().n5(var1);
      this.n5 = var2;
      this.l6 = var3;
   }

   @Override
   public String getName() {
      return this.k5;
   }

   @Override
   public String getLocalName() {
      return this.k5;
   }

   @Override
   public int getNodeType() {
      return 12;
   }

   @Override
   public l0 cloneNode(boolean deep) {
      throw new InvalidOperationException(v3.n5("'Entity' and 'Notation' nodes cannot be cloned."));
   }

   @Override
   public boolean isReadOnly() {
      return true;
   }

   @Override
   public String getOuterXml() {
      return com.aspose.slides.ms.System.d1.n5;
   }

   @Override
   public String getInnerXml() {
      return com.aspose.slides.ms.System.d1.n5;
   }

   @Override
   public void setInnerXml(String value) {
      throw new InvalidOperationException(v3.n5("Cannot set the 'InnerXml' for the current node because it is either read-only or cannot have children."));
   }

   @Override
   public void writeTo(l1 w) {
   }

   @Override
   public void writeContentTo(l1 w) {
   }
}
