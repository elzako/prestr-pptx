package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;

public class d3 extends s9 {
   public d3(String var1, XmlDocument var2) {
      super(var1, var2);
      if (!var2.isLoading() && !super.l6(var1)) {
         throw new ArgumentException(v3.n5("The string for white space contains an invalid character."));
      }
   }

   @Override
   public String getName() {
      return this.getOwnerDocument().strNonSignificantWhitespaceName;
   }

   @Override
   public String getLocalName() {
      return this.getOwnerDocument().strNonSignificantWhitespaceName;
   }

   @Override
   public int getNodeType() {
      return 13;
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
            return super.getParentNode();
      }
   }

   @Override
   public String getValue() {
      return this.k5();
   }

   @Override
   public void setValue(String value) {
      if (this.l6(value)) {
         this.n5(value);
      } else {
         throw new ArgumentException(v3.n5("The string for white space contains an invalid character."));
      }
   }

   @Override
   public l0 cloneNode(boolean deep) {
      return this.getOwnerDocument().createWhitespace(this.k5());
   }

   @Override
   public void writeTo(l1 w) {
      w.h0(this.k5());
   }

   @Override
   public void writeContentTo(l1 w) {
   }

   @Override
   public int getXPNodeType() {
      byte var1 = 6;
      int[] var2 = new int[]{6};
      this.n5(this, var2);
      return var2[0];
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
