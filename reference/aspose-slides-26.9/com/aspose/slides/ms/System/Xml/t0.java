package com.aspose.slides.ms.System.Xml;

public class t0 extends s9 {
   public t0(String var1) {
      this(var1, null);
   }

   public t0(String var1, XmlDocument var2) {
      super(var1, var2);
   }

   @Override
   public String getName() {
      return this.getOwnerDocument().strTextName;
   }

   @Override
   public String getLocalName() {
      return this.getOwnerDocument().strTextName;
   }

   @Override
   public int getNodeType() {
      return 3;
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
      return this.getOwnerDocument().createTextNode(this.k5());
   }

   @Override
   public String getValue() {
      return this.k5();
   }

   @Override
   public void setValue(String value) {
      this.n5(value);
      l0 var2 = this.parentNode;
      if (var2 != null && var2.getNodeType() == 2) {
         o4 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, o4.class);
         if (var3 != null && !var3.a6()) {
            var3.n5(true);
         }
      }
   }

   @Override
   public void writeTo(l1 w) {
      w.l6(this.k5());
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
