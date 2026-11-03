package com.aspose.slides.ms.System.Xml;

public class u5 extends s9 {
   public u5(String var1, XmlDocument var2) {
      super(var1, var2);
   }

   @Override
   public String getName() {
      return this.getOwnerDocument().strCDataSectionName;
   }

   @Override
   public String getLocalName() {
      return this.getOwnerDocument().strCDataSectionName;
   }

   @Override
   public int getNodeType() {
      return 4;
   }

   @Override
   public l0 getParentNode() {
      switch (this.parentNode.getNodeType()) {
         case 3:
         case 4:
         case 13:
         case 14:
            l0 var1 = this.parentNode.parentNode;

            while (var1.isText()) {
               var1 = var1.parentNode;
            }

            return var1;
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         case 12:
         default:
            return this.parentNode;
         case 9:
            return null;
      }
   }

   @Override
   public l0 cloneNode(boolean deep) {
      return this.getOwnerDocument().createCDataSection(this.k5());
   }

   @Override
   public void writeTo(l1 w) {
      w.a6(this.k5());
   }

   @Override
   public void writeContentTo(l1 w) {
   }

   @Override
   public int getXPNodeType() {
      return 4;
   }

   @Override
   public boolean isText() {
      return true;
   }

   @Override
   public l0 getPreviousText() {
      return this.parentNode.isText() ? this.parentNode : null;
   }
}
