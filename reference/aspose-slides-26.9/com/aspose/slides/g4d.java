package com.aspose.slides;

import com.aspose.slides.ms.System.Xml.XmlDocument;

class g4d implements i9b {
   @Override
   public final String n5(String var1, String var2) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         String var16 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "CsProject", "projectXml"});
         throw new t1c(var16);
      } else {
         XmlDocument var3 = new XmlDocument();
         var3.setXmlResolver(null);
         var3.loadXml(var1);
         com.aspose.slides.ms.System.Xml.m8 var4 = var3.createElement("ItemGroup", var3.get_Item("Project").n5("xmlns"));
         com.aspose.slides.ms.System.Xml.m8 var5 = var3.createElement("Page", var3.get_Item("Project").n5("xmlns"));
         com.aspose.slides.ms.System.Xml.u8 var6 = var3.createAttribute("Include");
         com.aspose.slides.ms.System.Xml.t0 var7 = var3.createTextNode(var2);
         var6.appendChild(var7);
         var5.getAttributes().l6(var6);
         com.aspose.slides.ms.System.Xml.m8 var8 = var3.createElement("Generator", var3.get_Item("Project").n5("xmlns"));
         var8.setInnerText("MSBuild:Compile");
         var5.appendChild(var8);
         com.aspose.slides.ms.System.Xml.m8 var9 = var3.createElement("SubType", var3.get_Item("Project").n5("xmlns"));
         var9.setInnerText("Designer");
         var5.appendChild(var9);
         var4.appendChild(var5);
         var3.get_Item("Project").appendChild(var4);
         com.aspose.slides.ms.System.Xml.m8 var10 = var3.createElement("Compile", var3.get_Item("Project").n5("xmlns"));
         com.aspose.slides.ms.System.Xml.u8 var11 = var3.createAttribute("Include");
         String var12 = com.aspose.slides.ms.System.d1.n5(new String[]{var2, ".cs"});
         com.aspose.slides.ms.System.Xml.t0 var13 = var3.createTextNode(var12);
         var11.appendChild(var13);
         var10.getAttributes().l6(var11);
         com.aspose.slides.ms.System.Xml.m8 var14 = var3.createElement("DependentUpon", var3.get_Item("Project").n5("xmlns"));
         var14.setInnerText(var2);
         var10.appendChild(var14);
         com.aspose.slides.ms.System.Xml.m8 var15 = var3.createElement("SubType", var3.get_Item("Project").n5("xmlns"));
         var15.setInnerText("Code");
         var10.appendChild(var15);
         var4.appendChild(var10);
         var3.get_Item("Project").appendChild(var4);
         return var3.getOuterXml();
      }
   }

   @Override
   public final String l6(String var1, String var2) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         String var8 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "CsProject", "projectXml"});
         throw new t1c(var8);
      } else {
         XmlDocument var3 = new XmlDocument();
         var3.setXmlResolver(null);
         var3.loadXml(var1);
         com.aspose.slides.ms.System.Xml.m8 var4 = var3.createElement("ItemGroup", var3.get_Item("Project").n5("xmlns"));
         com.aspose.slides.ms.System.Xml.m8 var5 = var3.createElement("AndroidResource", var3.get_Item("Project").n5("xmlns"));
         com.aspose.slides.ms.System.Xml.u8 var6 = var3.createAttribute("Include");
         com.aspose.slides.ms.System.Xml.t0 var7 = var3.createTextNode(var2);
         var6.appendChild(var7);
         var5.getAttributes().l6(var6);
         var4.appendChild(var5);
         var3.get_Item("Project").appendChild(var4);
         return var3.getOuterXml();
      }
   }

   @Override
   public final String k5(String var1, String var2) {
      if (com.aspose.slides.ms.System.d1.n5(var1)) {
         String var8 = com.aspose.slides.ms.System.d1.n5("In the '{0}' class was put a parameter '{1}' equal 'null'.",new Object[]{ "CsProject", "projectXml"});
         throw new t1c(var8);
      } else {
         XmlDocument var3 = new XmlDocument();
         var3.setXmlResolver(null);
         var3.loadXml(var1);
         com.aspose.slides.ms.System.Xml.m8 var4 = var3.createElement("ItemGroup", var3.get_Item("Project").n5("xmlns"));
         com.aspose.slides.ms.System.Xml.m8 var5 = var3.createElement("Resource", var3.get_Item("Project").n5("xmlns"));
         com.aspose.slides.ms.System.Xml.u8 var6 = var3.createAttribute("Include");
         com.aspose.slides.ms.System.Xml.t0 var7 = var3.createTextNode(var2);
         var6.appendChild(var7);
         var5.getAttributes().l6(var6);
         var4.appendChild(var5);
         var3.get_Item("Project").appendChild(var4);
         return var3.getOuterXml();
      }
   }
}
