package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.ms.System.Xml.k3;

public class u4 extends k3 {
   public boolean n5;
   public boolean l6;
   private static final SortedDictionary<String, String> k5 = new SortedDictionary<>();

   public u4(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.l7h.j5 var2, int var3) {
      super(var1, var2);
      this.n5 = var3 == 2;
      this.l6 = var3 == 1;
   }

   public u4(com.aspose.slides.internal.z0k.t4 var1, com.aspose.slides.internal.l7h.j5 var2) {
      super(var1, var2);
   }

   public u4(com.aspose.slides.internal.z0k.a0 var1, int var2) {
      super(var1);
      this.n5 = var2 == 2;
      this.l6 = var2 == 1;
   }

   public u4(com.aspose.slides.internal.z0k.a0 var1) {
      super(var1);
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      String var4 = this.u3(var3);
      super.n5(var1, var2, var4);
   }

   @Override
   public String n5(String var1) {
      String var2 = this.u3(var1);
      return super.n5(var2);
   }

   public final void u3(String var1, String var2, String var3, String var4) {
      String var5 = this.u3(var4);
      super.l6(var1, var2, var3, var5);
   }

   public final void l6(String var1, String var2) {
      String var3 = "uri".equals(var1) ? this.u3(var2) : var2;
      super.u3(var1, var3);
   }

   public static boolean n5(String var0, String[] var1) {
      return k5.tryGetValue(var0, var1);
   }

   private String u3(String var1) {
      if (this.n5) {
         String var2 = null;
         String[] var3 = new String[]{var2};
         boolean var4 = !com.aspose.slides.ms.System.d1.n5(var1) && k5.tryGetValue(var1, var3);
         var2 = var3[0];
         if (var4) {
            return var2;
         }
      }

      return var1;
   }

   static {
      k5.addItem(
         "http://schemas.microsoft.com/office/2011/relationships/chartColorStyle", "http://purl.oclc.org/ooxml/officeDocument/relationships/chartColorStyle"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chartUserShapes",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/chartUserShapes"
      );
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/chart", "http://purl.oclc.org/ooxml/officeDocument/relationships/chart");
      k5.addItem("http://schemas.microsoft.com/office/2011/relationships/chartStyle", "http://purl.oclc.org/ooxml/officeDocument/relationships/chartStyle");
      k5.addItem("http://schemas.microsoft.com/office/2014/relationships/chartEx", "http://purl.oclc.org/ooxml/officeDocument/relationships/chartEx");
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramColors",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramColors"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramData",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramData"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramLayout",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramLayout"
      );
      k5.addItem("http://schemas.openxmlformats.org/drawingml/2006/diagram", "http://purl.oclc.org/ooxml/drawingml/diagram");
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramQuickStyle",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramQuickStyle"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableStyles",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/tableStyles"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/themeOverride",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/themeOverride"
      );
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme", "http://purl.oclc.org/ooxml/officeDocument/relationships/theme");
      k5.addItem(
         "http://schemas.microsoft.com/office/2007/relationships/diagramDrawing", "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramDrawing"
      );
      k5.addItem(
         "http://schemas.microsoft.com/office/2006/relationships/legacyDiagramText",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/legacyDiagramText"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/vmlDrawing", "http://purl.oclc.org/ooxml/officeDocument/relationships/vmlDrawing"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/commentAuthors",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/commentAuthors"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/handoutMaster",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/handoutMaste"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/notesMaster",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/notesMaster"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/notesSlide", "http://purl.oclc.org/ooxml/officeDocument/relationships/notesSlide"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/officeDocument"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/presProps", "http://purl.oclc.org/ooxml/officeDocument/relationships/presProps"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slideLayout",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/slideLayout"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slideMaster",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/slideMaster"
      );
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide", "http://purl.oclc.org/ooxml/officeDocument/relationships/slide");
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/tags", "http://purl.oclc.org/ooxml/officeDocument/relationships/tags");
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/viewProps", "http://purl.oclc.org/ooxml/officeDocument/relationships/viewProps"
      );
      k5.addItem("http://schemas.microsoft.com/office/2006/relationships/downRev", "http://purl.oclc.org/ooxml/officeDocument/relationships/downRev");
      k5.addItem(
         "http://schemas.microsoft.com/office/2006/relationships/graphicFrameDoc", "http://purl.oclc.org/ooxml/officeDocument/relationships/graphicFrameDoc"
      );
      k5.addItem("http://schemas.microsoft.com/office/2006/relationships/pictureXml", "http://purl.oclc.org/ooxml/officeDocument/relationships/pictureXml");
      k5.addItem("http://schemas.microsoft.com/office/2006/relationships/shapeXml", "http://purl.oclc.org/ooxml/officeDocument/relationships/shapeXml");
      k5.addItem(
         "http://schemas.microsoft.com/office/2006/relationships/activeXControlBinary",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/activeXControlBinary"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/control", "http://purl.oclc.org/ooxml/officeDocument/relationships/control"
      );
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/audio", "http://purl.oclc.org/ooxml/officeDocument/relationships/audio");
      k5.addItem(
         "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/metadata/core-properties"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/custom-properties"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXml", "http://purl.oclc.org/ooxml/officeDocument/relationships/customXml"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXmlProps",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/customXmlProps"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/origin"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/extended-properties"
      );
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/font", "http://purl.oclc.org/ooxml/officeDocument/relationships/font");
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", "http://purl.oclc.org/ooxml/officeDocument/relationships/image");
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/oleObject", "http://purl.oclc.org/ooxml/officeDocument/relationships/oleObject"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/package", "http://purl.oclc.org/ooxml/officeDocument/relationships/package"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/package/2006/relationships/metadata/thumbnail",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/metadata/thumbnail"
      );
      k5.addItem("http://schemas.microsoft.com/office/2006/relationships/vbaProject", "http://purl.oclc.org/ooxml/officeDocument/relationships/vbaProject");
      k5.addItem(
         "http://schemas.microsoft.com/office/2006/relationships/vbaProjectSignature",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/vbaProjectSignature"
      );
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/video", "http://purl.oclc.org/ooxml/officeDocument/relationships/video");
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/calcChain", "http://purl.oclc.org/ooxml/officeDocument/relationships/calcChain"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chartsheet", "http://purl.oclc.org/ooxml/officeDocument/relationships/chartsheet"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/connections",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/connections"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/dialogsheet",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/dialogsheet"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/drawing", "http://purl.oclc.org/ooxml/officeDocument/relationships/drawing"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/externalLink",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/externalLink"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sheetMetadata",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/sheetMetadata"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheDefinition",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/pivotCacheDefinition"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheRecords",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/pivotCacheRecords"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotTable", "http://purl.oclc.org/ooxml/officeDocument/relationships/pivotTable"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/queryTable", "http://purl.oclc.org/ooxml/officeDocument/relationships/queryTable"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sharedStrings",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/sharedStrings"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionHeaders",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/revisionHeaders"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionLog",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/revisionLog"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/usernames", "http://purl.oclc.org/ooxml/officeDocument/relationships/usernames"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableSingleCells",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/tableSingleCells"
      );
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles", "http://purl.oclc.org/ooxml/officeDocument/relationships/styles");
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships/table", "http://purl.oclc.org/ooxml/officeDocument/relationships/table");
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/volatileDependencies",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/volatileDependencies"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/comments", "http://purl.oclc.org/ooxml/officeDocument/relationships/comments"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet", "http://purl.oclc.org/ooxml/officeDocument/relationships/worksheet"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extendedProperties",
         "http://purl.oclc.org/ooxml/officeDocument/relationships/extendedProperties"
      );
      k5.addItem(
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", "http://purl.oclc.org/ooxml/officeDocument/relationships/hyperlink"
      );
      k5.addItem("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "http://purl.oclc.org/ooxml/officeDocument/relationships");
      k5.addItem("http://schemas.openxmlformats.org/presentationml/2006/ole", "http://purl.oclc.org/ooxml/officeDocument/oleObject");
      k5.addItem("http://schemas.openxmlformats.org/presentationml/2006/main", "http://purl.oclc.org/ooxml/presentationml/main");
      k5.addItem("http://schemas.openxmlformats.org/drawingml/2006/main", "http://purl.oclc.org/ooxml/drawingml/main");
      k5.addItem("http://schemas.openxmlformats.org/drawingml/2006/table", "http://purl.oclc.org/ooxml/drawingml/table");
   }
}
