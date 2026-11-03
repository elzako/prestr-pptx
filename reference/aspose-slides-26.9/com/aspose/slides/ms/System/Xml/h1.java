package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.InvalidOperationException;

public class h1 extends l0 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private e0 h0;
   private boolean c8;

   public h1(String var1, String var2, String var3, String var4, String var5, XmlDocument var6) {
      super(var6);
      this.u3 = var6.getNameTable().n5(var1);
      this.n5 = var3;
      this.l6 = var4;
      this.k5 = var5;
      this.a6 = var2;
      this.c8 = false;
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
   public String getName() {
      return this.u3;
   }

   @Override
   public String getLocalName() {
      return this.u3;
   }

   @Override
   public String getInnerText() {
      return super.getInnerText();
   }

   @Override
   public void setInnerText(String value) {
      throw new InvalidOperationException(v3.n5("The 'InnerText' of an 'Entity' node is read-only and cannot be set."));
   }

   @Override
   public boolean isContainer() {
      return true;
   }

   @Override
   public e0 getLastNode() {
      if (this.h0 == null && !this.c8) {
         this.c8 = true;
         i2 var1 = new i2();
         var1.n5(this);
      }

      return this.h0;
   }

   @Override
   public void setLastNode(e0 value) {
      this.h0 = value;
   }

   @Override
   public boolean isValidChildType(int type) {
      return type == 3 || type == 1 || type == 7 || type == 8 || type == 4 || type == 13 || type == 14 || type == 5;
   }

   @Override
   public int getNodeType() {
      return 6;
   }

   public final String n5() {
      return this.l6;
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

   @Override
   public String getBaseURI() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.u9 = var1;
   }
}
