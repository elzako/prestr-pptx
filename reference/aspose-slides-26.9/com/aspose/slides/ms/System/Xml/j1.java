package com.aspose.slides.ms.System.Xml;

public class j1 extends e0 {
   private String n5;
   private String k5;

   public j1(String var1, String var2, XmlDocument var3) {
      super(var3);
      this.n5 = var1;
      this.k5 = var2;
   }

   @Override
   public String getName() {
      return this.n5 != null ? this.n5 : com.aspose.slides.ms.System.d1.n5;
   }

   @Override
   public String getLocalName() {
      return this.getName();
   }

   @Override
   public String getValue() {
      return this.k5;
   }

   @Override
   public void setValue(String value) {
      this.n5(value);
   }

   public final String l6() {
      return this.n5;
   }

   public final String k5() {
      return this.k5;
   }

   public final void n5(String var1) {
      l0 var2 = this.getParentNode();
      p9 var3 = this.getEventArgs(this, var2, var2, this.k5, var1, 2);
      if (var3 != null) {
         this.beforeEvent(var3);
      }

      this.k5 = var1;
      if (var3 != null) {
         this.afterEvent(var3);
      }
   }

   @Override
   public String getInnerText() {
      return this.k5;
   }

   @Override
   public void setInnerText(String value) {
      this.n5(value);
   }

   @Override
   public int getNodeType() {
      return 7;
   }

   @Override
   public l0 cloneNode(boolean deep) {
      return this.getOwnerDocument().createProcessingInstruction(this.n5, this.k5);
   }

   @Override
   public void writeTo(l1 w) {
      w.n5(this.n5, this.k5);
   }

   @Override
   public void writeContentTo(l1 w) {
   }

   @Override
   public String getXPLocalName() {
      return this.getName();
   }

   @Override
   public int getXPNodeType() {
      return 7;
   }
}
