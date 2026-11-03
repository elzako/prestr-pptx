package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Arrays;
import java.util.Date;

public class DocumentProperties implements IDocumentProperties, IGenericCloneable<IDocumentProperties>, Cloneable {
   private byte[] n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private String[] c8;
   private IHeadingPair[] t2;
   private SortedList<String, Object> s7 = new SortedList<>(com.aspose.slides.ms.System.p6.l6());
   private int x8;
   private com.aspose.slides.ms.System.s4 n3 = new com.aspose.slides.ms.System.s4();
   private String[] y4;
   private com.aspose.slides.ms.System.j5[] e2;
   private boolean[] t9;
   private Presentation z1;
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9("Enabled", "SiteId", "Method", "ContentBits");

   @Override
   public final String getAppVersion() {
      return this.y4[15];
   }

   final void n5(String var1) {
      this.y4[15] = var1;
   }

   @Override
   public final String getNameOfApplication() {
      return this.y4[9];
   }

   @Override
   public final void setNameOfApplication(String value) {
      this.y4[9] = value;
   }

   @Override
   public final String getCompany() {
      return this.y4[10];
   }

   @Override
   public final void setCompany(String value) {
      this.y4[10] = value;
   }

   @Override
   public final String getManager() {
      return this.y4[11];
   }

   @Override
   public final void setManager(String value) {
      this.y4[11] = value;
   }

   @Override
   public final String getPresentationFormat() {
      return this.y4[12];
   }

   @Override
   public final void setPresentationFormat(String value) {
      this.y4[12] = value;
   }

   @Override
   public final boolean getSharedDoc() {
      return this.t9[0];
   }

   @Override
   public final void setSharedDoc(boolean value) {
      this.t9[0] = value;
   }

   @Override
   public final String getApplicationTemplate() {
      return this.y4[13];
   }

   @Override
   public final void setApplicationTemplate(String value) {
      this.y4[13] = value;
   }

   @Override
   public final double getTotalEditingTime() {
      return com.aspose.slides.ms.System.s4.u9(this.n5());
   }

   com.aspose.slides.ms.System.s4 n5() {
      return this.n3;
   }

   @Override
   public final void setTotalEditingTime(double value) {
      this.n5(com.aspose.slides.ms.System.s4.a6(value));
   }

   void n5(com.aspose.slides.ms.System.s4 var1) {
      var1.u3(this.n3);
   }

   @Override
   public final String getTitle() {
      return this.y4[0];
   }

   @Override
   public final void setTitle(String value) {
      this.y4[0] = value;
   }

   @Override
   public final String getSubject() {
      return this.y4[1];
   }

   @Override
   public final void setSubject(String value) {
      this.y4[1] = value;
   }

   @Override
   public final String getAuthor() {
      return this.y4[2];
   }

   @Override
   public final void setAuthor(String value) {
      this.y4[2] = value;
   }

   @Override
   public final String getKeywords() {
      return this.y4[3];
   }

   @Override
   public final void setKeywords(String value) {
      this.y4[3] = value;
   }

   @Override
   public final String getComments() {
      return this.y4[4];
   }

   @Override
   public final void setComments(String value) {
      this.y4[4] = value;
   }

   @Override
   public final String getCategory() {
      return this.y4[5];
   }

   @Override
   public final void setCategory(String value) {
      this.y4[5] = value;
   }

   @Override
   public final Date getCreatedTime() {
      return com.aspose.slides.ms.System.j5.k5(this.l6());
   }

   com.aspose.slides.ms.System.j5 l6() {
      return this.e2[0];
   }

   @Override
   public final void setCreatedTime(Date value) {
      this.n5(com.aspose.slides.ms.System.j5.n5(value));
   }

   void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.e2[0]);
   }

   @Override
   public final Date getLastSavedTime() {
      return com.aspose.slides.ms.System.j5.k5(this.k5());
   }

   com.aspose.slides.ms.System.j5 k5() {
      return this.e2[1];
   }

   @Override
   public final void setLastSavedTime(Date value) {
      this.l6(com.aspose.slides.ms.System.j5.n5(value));
   }

   void l6(com.aspose.slides.ms.System.j5 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.z1, Presentation.class)) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(
               "LastSavedTime can't be changed via Presentation.DocumentProperties property. ",
               "This property is internally updated while IPresentation object saving process. Please use the ",
               "instance of PresentationInfo class to change this value of an existing presentation. ",
               "Please see the example in IPresentationInfo.UpdateDocumentProperties method summary."
            )
         );
      }

      this.u3(var1.m3());
   }

   @Override
   public final Date getLastPrinted() {
      return com.aspose.slides.ms.System.j5.k5(this.u3());
   }

   com.aspose.slides.ms.System.j5 u3() {
      return this.e2[2];
   }

   @Override
   public final void setLastPrinted(Date value) {
      this.k5(com.aspose.slides.ms.System.j5.n5(value));
   }

   void k5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.e2[2]);
   }

   @Override
   public final String getLastSavedBy() {
      return this.y4[8];
   }

   @Override
   public final void setLastSavedBy(String value) {
      this.y4[8] = value;
   }

   @Override
   public final int getRevisionNumber() {
      return this.x8;
   }

   @Override
   public final void setRevisionNumber(int value) {
      this.x8 = value;
   }

   @Override
   public final String getContentStatus() {
      return this.y4[6];
   }

   @Override
   public final void setContentStatus(String value) {
      this.y4[6] = value;
   }

   @Override
   public final String getContentType() {
      return this.y4[7];
   }

   @Override
   public final void setContentType(String value) {
      this.y4[7] = value;
   }

   @Override
   public final String getHyperlinkBase() {
      return this.y4[14];
   }

   @Override
   public final void setHyperlinkBase(String value) {
      this.y4[14] = value;
   }

   @Override
   public final int getCountOfCustomProperties() {
      return this.s7.size();
   }

   @Override
   public final String getCustomPropertyName(int index) {
      if (index >= 0 && index < this.getCountOfCustomProperties()) {
         return this.s7.getKeys().get_Item(index);
      } else {
         throw new ArgumentOutOfRangeException("index", index, "Property index is out of range.");
      }
   }

   @Override
   public final boolean removeCustomProperty(String name) {
      if (!this.s7.containsKey(name)) {
         return false;
      }

      this.s7.removeItemByKey(name);
      return true;
   }

   @Override
   public final boolean containsCustomProperty(String name) {
      return this.s7.containsKey(name);
   }

   @Override
   public final Object get_Item(String name) {
      Object var2 = this.s7.get_Item(name);
      if (var2 != null && var2 instanceof com.aspose.slides.ms.System.j5) {
         var2 = com.aspose.slides.ms.System.j5.k5((com.aspose.slides.ms.System.j5)var2);
      }

      if (var2 != null && var2 instanceof com.aspose.slides.ms.System.s4) {
         var2 = Long.valueOf(com.aspose.slides.ms.System.s4.a6((com.aspose.slides.ms.System.s4)var2)).toString();
      }

      return var2;
   }

   @Override
   public final void set_Item(String name, Object value) {
      if (!com.aspose.slides.internal.v6g.k5.l6(value, Boolean.class)
         && !com.aspose.slides.internal.v6g.k5.l6(value, Integer.class)
         && !com.aspose.slides.internal.v6g.k5.l6(value, com.aspose.slides.ms.System.j5.class)
         && !com.aspose.slides.internal.v6g.k5.l6(value, String.class)
         && !com.aspose.slides.internal.v6g.k5.l6(value, Float.class)
         && !com.aspose.slides.internal.v6g.k5.l6(value, Double.class)
         && !com.aspose.slides.internal.v6g.k5.l6(value, Date.class)) {
         throw new PptxEditException("Wrong value type of the custom property. The type can be bool, int, float, double, string and DateTime.");
      }

      this.s7.set_Item(name, value);
   }

   final Object l6(String var1) {
      Object var2 = null;
      Object[] var3 = new Object[]{var2};
      this.s7.tryGetValue(var1, var3);
      return var3[0];
   }

   final void n5(String var1, Object var2) {
      if ((var2 == null || !com.aspose.slides.internal.v6g.k5.l6(var2, Boolean.class))
         && !com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.ms.System.j5.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, String.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.ms.System.s4.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, Integer.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, Float.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, Double.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var2, Date.class)) {
         throw new PptxEditException("Wrong value type of the custom property. The type can be bool, int, float, double, string, DateTime.");
      }

      this.s7.set_Item(var1, var2);
   }

   @Override
   public final void getCustomPropertyValue(String name, boolean[] value) {
      value[0] = com.aspose.slides.internal.v6g.k5.u3(this.l6(name), boolean.class);
   }

   @Override
   public final void getCustomPropertyValue(String name, int[] value) {
      value[0] = com.aspose.slides.internal.v6g.k5.u3(this.l6(name), int.class);
   }

   @Override
   public final void getCustomPropertyValue(String name, Date[] value) {
      com.aspose.slides.ms.System.j5[] var3 = new com.aspose.slides.ms.System.j5[]{new com.aspose.slides.ms.System.j5()};
      this.n5(name, var3);
      value[0] = com.aspose.slides.ms.System.j5.k5(var3[0]);
   }

   void n5(String var1, com.aspose.slides.ms.System.j5[] var2) {
      com.aspose.slides.internal.v6g.k5.u3(this.l6(var1), com.aspose.slides.ms.System.j5.class).u3(var2[0]);
   }

   @Override
   public final void getCustomPropertyValue(String name, String[] value) {
      value[0] = (String)this.l6(name);
   }

   @Override
   public final void getCustomPropertyValue(String name, float[] value) {
      value[0] = com.aspose.slides.internal.v6g.k5.u3(this.l6(name), float.class);
   }

   @Override
   public final void getCustomPropertyValue(String name, double[] value) {
      value[0] = com.aspose.slides.internal.v6g.k5.u3(this.l6(name), double.class);
   }

   @Override
   public final void setCustomPropertyValue(String name, boolean value) {
      this.n5(name, value);
   }

   @Override
   public final void setCustomPropertyValue(String name, int value) {
      this.n5(name, value);
   }

   @Override
   public final void setCustomPropertyValue(String name, Date value) {
      this.n5(name, com.aspose.slides.ms.System.j5.n5(value));
   }

   void n5(String var1, com.aspose.slides.ms.System.j5 var2) {
      this.n5(var1, (Object)var2.m3());
   }

   @Override
   public final void setCustomPropertyValue(String name, String value) {
      this.n5(name, value);
   }

   @Override
   public final void setCustomPropertyValue(String name, float value) {
      this.n5(name, value);
   }

   @Override
   public final void setCustomPropertyValue(String name, double value) {
      this.n5(name, value);
   }

   @Override
   public final void clearCustomProperties() {
      this.s7.clear();
   }

   @Override
   public final ISensitivityLabel[] getSensitivityLabels() {
      List var1 = new List();
      if (this.s7.size() == 0) {
         return (ISensitivityLabel[])var1.toArray(new ISensitivityLabel[0]);
      }

      SensitivityLabel var2 = new SensitivityLabel();
      String var3 = null;
      String var4 = null;

      for (int var5 = 0; var5 < this.s7.getKeys().size(); var5++) {
         String var6 = this.s7.getKeys().get_Item(var5);
         if (com.aspose.slides.ms.System.d1.l6(var6, "MSIP_Label")) {
            String[] var7 = com.aspose.slides.ms.System.d1.n5(var6, '_');
            if (var7.length >= 4) {
               var4 = var7[2];
               if (var3 != null
                  && !com.aspose.slides.ms.System.d1.a6(var4, var3)
                  && com.aspose.slides.ms.System.o0.l6(var2.n5(), com.aspose.slides.ms.System.o0.n5)) {
                  var2.setId(com.aspose.slides.ms.System.d1.n5("{{{0}}}", new Object[]{var3}));
                  var1.addItem(var2);
                  var2 = new SensitivityLabel();
               }

               switch (t4.n5(var7[var7.length - 1])) {
                  case 0:
                     String var22 = null;
                     String[] var26 = new String[]{var22};
                     this.getCustomPropertyValue(var6, var26);
                     var22 = var26[0];
                     var2.setEnabled("true".equals(com.aspose.slides.ms.System.d1.u9(var22)));
                     break;
                  case 1:
                     Object var21 = this.l6(var6);
                     com.aspose.slides.ms.System.o0 var25 = new com.aspose.slides.ms.System.o0();
                     com.aspose.slides.ms.System.o0[] var28 = new com.aspose.slides.ms.System.o0[]{var25};
                     boolean var29 = var21 != null && com.aspose.slides.internal.n8e.v4.n5((String)var21, var28);
                     var28[0].k5(var25);
                     if (var29) {
                        var2.n5(var25.k5());
                     }
                     break;
                  case 2:
                     Object var19 = null;
                     String[] var24 = new String[]{(String)var19};
                     this.getCustomPropertyValue(var6, var24);
                     String var20 = var24[0];
                     if ("Privileged".equals(var20) || "Manual".equals(var20)) {
                        var2.setAssignmentMethodType(1);
                     }
                     break;
                  case 3:
                     String var8 = null;
                     String[] var9 = new String[]{var8};
                     this.getCustomPropertyValue(var6, var9);
                     var8 = var9[0];
                     int var10 = 0;
                     int[] var11 = new int[]{0};
                     boolean var12 = com.aspose.slides.ms.System.a3.n5(var8, var11);
                     var10 = var11[0];
                     if (var12) {
                        List$Enumerator var13 = v8p.n5(var10 & 4294967295L).iterator();

                        try {
                           while (var13.hasNext()) {
                              int var14 = com.aspose.slides.internal.v6g.k5.u3(var13.next(), int.class);
                              var2.getContentMarkTypes().addItem(var14);
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                              var13.dispose();
                           }
                        }
                     }
               }

               var3 = var4;
            }
         }
      }

      if (var3 != null && com.aspose.slides.ms.System.d1.a6(var4, var3) && com.aspose.slides.ms.System.o0.l6(var2.n5(), com.aspose.slides.ms.System.o0.n5)) {
         var2.setId(com.aspose.slides.ms.System.d1.n5("{{{0}}}", new Object[]{var3}));
         var1.addItem(var2);
      }

      return (ISensitivityLabel[])var1.toArray(new ISensitivityLabel[0]);
   }

   @Override
   public final void clearBuiltInProperties() {
      for (int var1 = 0; var1 < 16; var1++) {
         this.y4[var1] = com.aspose.slides.ms.System.d1.n5;
      }

      for (int var2 = 0; var2 < 3; var2++) {
         com.aspose.slides.ms.System.j5.s7().u3(this.e2[var2]);
      }

      for (int var3 = 0; var3 < 4; var3++) {
         this.t9[var3] = false;
      }

      com.aspose.slides.ms.System.s4.k5.u3(this.n3);
      this.x8 = 1;
      String[] var4 = com.aspose.slides.ms.System.d1.n5("26.9", '.');
      this.n5(com.aspose.slides.ms.System.d1.n5("{0:00}.{1:00}{2:00}", 26, 9, var4.length > 2 ? com.aspose.slides.ms.System.a3.n5(var4[2]) : 0));
   }

   @Override
   public final boolean getScaleCrop() {
      return this.t9[1];
   }

   @Override
   public final void setScaleCrop(boolean value) {
      this.t9[1] = value;
   }

   @Override
   public final boolean getLinksUpToDate() {
      return this.t9[2];
   }

   @Override
   public final void setLinksUpToDate(boolean value) {
      this.t9[2] = value;
   }

   final byte[] a6() {
      return this.n5;
   }

   final void n5(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   public final boolean getHyperlinksChanged() {
      return this.t9[3];
   }

   @Override
   public final void setHyperlinksChanged(boolean value) {
      this.t9[3] = value;
   }

   @Override
   public final int getSlides() {
      return this.l6;
   }

   final void n5(int var1) {
      this.l6 = var1;
   }

   @Override
   public final int getHiddenSlides() {
      return this.k5;
   }

   final void l6(int var1) {
      this.k5 = var1;
   }

   @Override
   public final int getNotes() {
      return this.u3;
   }

   final void k5(int var1) {
      this.u3 = var1;
   }

   @Override
   public final int getParagraphs() {
      return this.a6;
   }

   final void u3(int var1) {
      this.a6 = var1;
   }

   @Override
   public final int getWords() {
      return this.u9;
   }

   final void a6(int var1) {
      this.u9 = var1;
   }

   @Override
   public final int getMultimediaClips() {
      return this.h0;
   }

   final void u9(int var1) {
      this.h0 = var1;
   }

   @Override
   public final String[] getTitlesOfParts() {
      return this.c8;
   }

   final void n5(String[] var1) {
      this.c8 = var1;
   }

   @Override
   public final IHeadingPair[] getHeadingPairs() {
      return this.t2;
   }

   final void n5(IHeadingPair[] var1) {
      this.t2 = var1;
   }

   public DocumentProperties() {
      this.z1 = null;
      this.h0();
   }

   DocumentProperties(Presentation parent) {
      if (parent == null) {
         throw new ArgumentNullException("parent");
      }

      this.z1 = parent;
      this.h0();
   }

   final boolean u9() {
      List var1 = new List();
      var1.addItem("Microsoft Office PowerPoint");
      var1.addItem("Microsoft PowerPoint");
      var1.addItem("Aspose.Slides for");
      var1.addItem("Microsoft Macintosh PowerPoint");
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            if (com.aspose.slides.ms.System.d1.l6(this.getNameOfApplication(), var3)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   final void u3(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.e2[1]);
   }

   private void h0() {
      this.y4 = new String[16];
      this.e2 = (com.aspose.slides.ms.System.j5[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.j5.class), 3)
      );
      this.t9 = new boolean[4];
      this.clearBuiltInProperties();
   }

   public final Object deepClone() {
      return this.cloneT();
   }

   public final IDocumentProperties cloneT() {
      DocumentProperties var1 = (DocumentProperties)this.memberwiseClone();
      var1.s7 = new SortedList<>();
      IGenericEnumerator var2 = this.s7.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1.s7.addItem((String)var3.getKey(), var3.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.z1 = null;
      return var1;
   }

   protected Object memberwiseClone() {
      try {
         DocumentProperties var1 = (DocumentProperties)super.clone();
         if (this.e2 != null) {
            var1.e2 = Arrays.copyOf(this.e2, this.e2.length);
         }

         if (this.t9 != null) {
            var1.t9 = Arrays.copyOf(this.t9, this.t9.length);
         }

         if (this.y4 != null) {
            var1.y4 = Arrays.copyOf(this.y4, this.y4.length);
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
