package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.OperationCanceledException;

public abstract class s7 {
   private int l6;
   private com.aspose.slides.internal.e5a.d2 k5;
   private boolean u3;
   private com.aspose.slides.internal.b8.s7 a6 = com.aspose.slides.internal.b8.c8.n5;
   public static final SortedDictionary<String, String> n5 = new SortedDictionary<>();

   public final boolean n5() {
      return this.l6 == 2;
   }

   public final String n5(String var1) {
      String var2 = null;
      String[] var3 = new String[]{var2};
      boolean var4 = n5.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         this.l6 = 2;
         return var2;
      } else {
         return var1;
      }
   }

   public final boolean l6() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.e5a.d2 k5() {
      return this.k5;
   }

   protected abstract void u3();

   protected final void a6() {
      this.k5 = new com.aspose.slides.internal.e5a.d2();
   }

   protected final void n5(com.aspose.slides.internal.z0k.t4 var1, boolean var2, com.aspose.slides.internal.b8.s7 var3) {
      this.a6 = var3;
      if (var2) {
         var1 = this.n5(var1);
      }

      try {
         this.k5 = com.aspose.slides.internal.e5a.d2.n5(var1, true);
         this.u3();
      } catch (OperationCanceledException var5) {
         throw var5;
      } catch (com.aspose.slides.internal.e5a.a0 var6) {
         throw new w3("Unknown file format.", var6);
      } catch (RuntimeException var7) {
         throw new w3("", var7);
      }
   }

   protected final void u9() {
      this.a6.n5();
   }

   private com.aspose.slides.internal.z0k.t4 n5(com.aspose.slides.internal.z0k.t4 var1) {
      byte[] var2 = new byte[4096];
      long var3 = 0L;
      if (var1.canSeek()) {
         var3 = var1.getLength() - var1.getPosition();
      }

      if (var3 > 32767L || var3 < 0L) {
         var3 = 0L;
      }

      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2((int)var3);

      while (true) {
         int var6 = var1.read(var2, 0, var2.length);
         if (var6 == 0) {
            var5.seek(0L, 0);
            return var5;
         }

         var5.write(var2, 0, var6);
      }
   }

   public final int h0() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   static {
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/chartColorStyle", "http://schemas.microsoft.com/office/2011/relationships/chartColorStyle"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/chartUserShapes",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chartUserShapes"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/chart", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chart");
      n5.addItem("http://purl.oclc.org/ooxml/drawingml/chart", "http://schemas.openxmlformats.org/drawingml/2006/chart");
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/chartStyle", "http://schemas.microsoft.com/office/2011/relationships/chartStyle");
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/chartEx", "http://schemas.microsoft.com/office/2014/relationships/chartEx");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramColors",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramColors"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramData",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramData"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramLayout",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramLayout"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramQuickStyle",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/diagramQuickStyle"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/tableStyles",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableStyles"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/themeOverride",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/themeOverride"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/theme", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/diagramDrawing", "http://schemas.microsoft.com/office/2007/relationships/diagramDrawing"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/legacyDiagramText",
         "http://schemas.microsoft.com/office/2006/relationships/legacyDiagramText"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/vmlDrawing", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/vmlDrawing"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/commentAuthors",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/commentAuthors"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/handoutMaste",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/handoutMaster"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/notesMaster",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/notesMaster"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/notesSlide", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/notesSlide"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/officeDocument",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/presProps", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/presProps"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/slideLayout",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slideLayout"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/slideMaster",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slideMaster"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/slide", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide");
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/tags", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tags");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/viewProps", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/viewProps"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/downRev", "http://schemas.microsoft.com/office/2006/relationships/downRev");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/graphicFrameDoc", "http://schemas.microsoft.com/office/2006/relationships/graphicFrameDoc"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/pictureXml", "http://schemas.microsoft.com/office/2006/relationships/pictureXml");
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/shapeXml", "http://schemas.microsoft.com/office/2006/relationships/shapeXml");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/activeXControlBinary",
         "http://schemas.microsoft.com/office/2006/relationships/activeXControlBinary"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/control", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/control"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/audio", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/audio");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/metadata/core-properties",
         "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/custom-properties",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/customXml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXml"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/customXmlProps",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXmlProps"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/origin",
         "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/extended-properties",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/font", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/font");
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/image", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/oleObject", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/oleObject"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/package", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/package"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/metadata/thumbnail",
         "http://schemas.openxmlformats.org/package/2006/relationships/metadata/thumbnail"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/vbaProject", "http://schemas.microsoft.com/office/2006/relationships/vbaProject");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/vbaProjectSignature",
         "http://schemas.microsoft.com/office/2006/relationships/vbaProjectSignature"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/video", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/video");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/calcChain", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/calcChain"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/chartsheet", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/chartsheet"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/connections",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/connections"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/dialogsheet",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/dialogsheet"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/drawing", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/drawing"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/externalLink",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/externalLink"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/sheetMetadata",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sheetMetadata"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/pivotCacheDefinition",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheDefinition"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/pivotCacheRecords",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheRecords"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/pivotTable", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotTable"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/queryTable", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/queryTable"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/sharedStrings",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sharedStrings"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/revisionHeaders",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionHeaders"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/revisionLog",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/revisionLog"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/usernames", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/usernames"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/tableSingleCells",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/tableSingleCells"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/styles", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles");
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships/table", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/table");
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/volatileDependencies",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/volatileDependencies"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/comments", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/comments"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/worksheet", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/extendedProperties",
         "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extendedProperties"
      );
      n5.addItem(
         "http://purl.oclc.org/ooxml/officeDocument/relationships/hyperlink", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink"
      );
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/relationships", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      n5.addItem("http://purl.oclc.org/ooxml/officeDocument/oleObject", "http://schemas.openxmlformats.org/presentationml/2006/ole");
      n5.addItem("http://purl.oclc.org/ooxml/presentationml/main", "http://schemas.openxmlformats.org/presentationml/2006/main");
      n5.addItem("http://purl.oclc.org/ooxml/drawingml/main", "http://schemas.openxmlformats.org/drawingml/2006/main");
      n5.addItem("http://purl.oclc.org/ooxml/drawingml/table", "http://schemas.openxmlformats.org/drawingml/2006/table");
   }
}
