package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;

public class a1 extends e0 {
   private String n5;
   private String k5;
   private String u3;

   public a1(String var1, String var2, String var3, XmlDocument var4) {
      super(var4);
      if (!this.u3(var1)) {
         throw new ArgumentException(v3.n5("Wrong XML version information. The XML must match production \"VersionNum ::= '1.' [0-9]+\"."));
      }

      if (var3 != null && var3.length() > 0 && !"yes".equals(var3) && !"no".equals(var3)) {
         throw new ArgumentException(v3.n5("Wrong value for the XML declaration standalone attribute of '{0}'.", var3));
      }

      this.l6(var2);
      this.k5(var3);
      this.n5(var1);
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1 == null ? com.aspose.slides.ms.System.d1.n5 : var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void k5(String var1) {
      if (var1 == null) {
         this.u3 = com.aspose.slides.ms.System.d1.n5;
      } else {
         if (var1.length() != 0 && !"yes".equals(var1) && !"no".equals(var1)) {
            throw new ArgumentException(v3.n5("Wrong value for the XML declaration standalone attribute of '{0}'.", var1));
         }

         this.u3 = var1;
      }
   }

   @Override
   public String getValue() {
      return this.getInnerText();
   }

   @Override
   public void setValue(String value) {
      this.setInnerText(value);
   }

   @Override
   public String getInnerText() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5(com.aspose.slides.ms.System.d1.n5(new String[]{"version=\"", this.n5(), "\""}));
      if (this.l6().length() > 0) {
         var1.n5(" encoding=\"");
         var1.n5(this.l6());
         var1.n5("\"");
      }

      if (this.k5().length() > 0) {
         var1.n5(" standalone=\"");
         var1.n5(this.k5());
         var1.n5("\"");
      }

      return var1.toString();
   }

   @Override
   public void setInnerText(String value) {
      String var2 = null;
      String var3 = null;
      String var4 = null;
      String var5 = this.l6();
      String var6 = this.k5();
      String var7 = this.n5();
      String[] var8 = new String[]{var2};
      String[] var9 = new String[]{var3};
      String[] var10 = new String[]{var4};
      i2.n5(value, var8, var9, var10);
      var2 = var8[0];
      var3 = var9[0];
      var4 = var10[0];

      try {
         if (var2 != null && !this.u3(var2)) {
            throw new ArgumentException(v3.n5("Wrong XML version information. The XML must match production \"VersionNum ::= '1.' [0-9]+\"."));
         }

         this.n5(var2);
         if (var3 != null) {
            this.l6(var3);
         }

         if (var4 != null) {
            this.k5(var4);
         }
      } catch (RuntimeException var12) {
         this.l6(var5);
         this.k5(var6);
         this.n5(var7);
         throw var12;
      }
   }

   @Override
   public String getName() {
      return "xml";
   }

   @Override
   public String getLocalName() {
      return this.getName();
   }

   @Override
   public int getNodeType() {
      return 17;
   }

   @Override
   public l0 cloneNode(boolean deep) {
      return this.getOwnerDocument().createXmlDeclaration(this.n5(), this.l6(), this.k5());
   }

   @Override
   public void writeTo(l1 w) {
      w.n5(this.getName(), this.getInnerText());
   }

   @Override
   public void writeContentTo(l1 w) {
   }

   private boolean u3(String var1) {
      return var1.length() >= 3 && var1.charAt(0) == '1' && var1.charAt(1) == '.' && u4.n5(var1, 2, var1.length() - 2);
   }
}
