package com.aspose.slides.internal.i1;

import com.aspose.slides.internal.b3.z8;
import com.aspose.slides.internal.e5.q0;
import com.aspose.slides.ms.System.d1;

public class u3 implements q0 {
   private t2 n5 = null;

   public u3(t2 var1) {
      this.n5 = var1;
   }

   private void n5(String var1) {
      if (this.n5 != null) {
         this.n5.n5(var1);
      }
   }

   @Override
   public final void n5(Object var1, String var2, com.aspose.slides.internal.o0.l6 var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("For \"{0}\", only one \"{1}\" may be declared. Line({2})\\Col({3})",new Object[]{ var2, var3.l6(), var3.l6(), var4.n5(), var4.l6()}));
   }

   @Override
   public final void n5(Object var1, String var2, String var3, String var4, boolean var5, com.aspose.slides.internal.w2.u9 var6) {
      this.n5(d1.n5("For \"{0}\", \"{1}\" must be declared before \"{2}\"! Line({3})\\Col({4})",new Object[]{ var2, var3, var4, var6.n5(), var6.l6()}));
   }

   @Override
   public final void n5(Object var1, String var2, com.aspose.slides.internal.o0.l6 var3, String var4, com.aspose.slides.internal.w2.u9 var5) {
      this.n5(d1.n5("\"{0}\" is not a valid child of \"{1}\"![ {2}] Line({3})\\Col({4})",new Object[]{ var3.l6(), var2, var4, var5.n5(), var5.l6()}));
   }

   @Override
   public final void n5(Object var1, String var2, String var3, boolean var4, com.aspose.slides.internal.w2.u9 var5) {
      this.n5(d1.n5("\"{0}\" is missing) child elements.[ Required content model: {1}] Line({2})\\Col({3})",new Object[]{ var2, var3, var5.n5(), var5.l6()}));
   }

   @Override
   public final void n5(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("Element \"{0}\" is missing required property \"{1}\"! Line({2})\\Col({3})",new Object[]{ var2, var3, var4.n5(), var4.l6()}));
   }

   @Override
   public final void l6(Object var1, String var2, String var3, boolean var4, com.aspose.slides.internal.w2.u9 var5) {
      this.n5(
         d1.n5(
            "Property ID \"{0}\" (found on \"{1}\") previously used; ID values must be unique within a document! Any reference to it will be considered a reference to the first occurrence in the document. Line({2})\\Col({3})",new Object[]{
            var3,
            var2,
            var5.n5(),
            var5.l6()
         })
      );
   }

   @Override
   public final void l6(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("Duplicate color profile profile name: {0} Line({1})\\Col({2})",new Object[]{ var3, var4.n5(), var4.l6()}));
   }

   @Override
   public final void k5(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(
         d1.n5("The page master name (\"{0}\") must be unique across page-masters and page-sequence-masters. Line({1})\\Col({2})",new Object[]{ var3, var4.n5(), var4.l6()})
      );
   }

   @Override
   public final void n5(Object var1, com.aspose.slides.internal.w2.u9 var2) {
      this.n5(
         d1.n5(
            "Only an fo:block-container that does not generate absolutely positioned areas may have one or more fo:markers as its initial children. Line({0})\\Col({1})",new Object[]{
            var2.n5(),
            var2.l6()
         })
      );
   }

   @Override
   public final void u3(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("fo:marker must be an initial child: {0} Line({1})\\Col({2})",new Object[]{ var3, var4.n5(), var4.l6()}));
   }

   @Override
   public final void a6(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("fo:marker \"marker-class-name\" must be unique for same parent: {0} Line({1})\\Col({2})",new Object[]{ var3, var4.n5(), var4.l6()}));
   }

   @Override
   public final void n5(Object var1, String var2, com.aspose.slides.internal.o0.l6 var3, boolean var4, com.aspose.slides.internal.w2.u9 var5) {
      this.n5(d1.n5("Invalid property encountered on \"{0}\": {1} Line({2})\\Col({3})",new Object[]{ var2, var3, var5.n5(), var5.l6()}));
   }

   @Override
   public final void n5(Object var1, String var2, String var3, String var4, z8 var5, com.aspose.slides.internal.w2.u9 var6) {
      this.n5(d1.n5("Invalid property value encountered in {0}=\"{1}\"[: {2}] Line({3})\\Col({4})",new Object[]{ var3, var4, var5, var6.n5(), var6.l6()}));
   }

   @Override
   public final void u9(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("The following feature isn't implemented yet: {0} (on {1}) Line({2})\\Col({3})",new Object[]{ var3, var2, var4.n5(), var4.l6()}));
   }

   @Override
   public final void n5(Object var1, String var2, com.aspose.slides.internal.w2.u9 var3) {
      this.n5(
         d1.n5(
            "Missing attribute on {0}: Either external-destination or internal-destination must be specified.Line({1})\\Col({2})",new Object[]{ var2, var3.n5(), var3.l6()
         })
      );
   }

   @Override
   public final void n5(Object var1, String var2, com.aspose.slides.internal.y1.l6 var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("Unable to clone subtree of fo:marker (marker-class-name=\"{0}\") for fo:retrieve-marker. Line({1})\\Col({2})",new Object[]{ var2, var4.n5(), var4.l6()}));
   }

   @Override
   public final void n5(Object var1, String var2, String var3, String var4, com.aspose.slides.internal.w2.u9 var5) {
      this.n5(
         d1.n5("Region-name (\"{0}\") is being mapped to multiple region-classes ({1} and {2}). Line({3})\\Col({4})",new Object[]{ var2, var3, var4, var5.n5(), var5.l6()})
      );
   }

   @Override
   public final void h0(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("Duplicate flow-name \"{0}\" found within {1}. Line({2})\\Col({3})",new Object[]{ var3, var2, var4.n5(), var4.l6()}));
   }

   @Override
   public final void c8(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(
         d1.n5(
            "The flow-name \"{0}\" on {1} could not be mapped to a region-name in the layout-master-set. Line({2})\\Col({3})",new Object[]{ var3, var2, var4.n5(), var4.l6()
         })
      );
   }

   @Override
   public final void t2(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(
         d1.n5(
            "The master-reference \"{0}\" on {1} matches no simple-page-master or page-sequence-master. Line({2})\\Col({3})",new Object[]{ var3, var2, var4.n5(), var4.l6()
         })
      );
   }

   @Override
   public final void s7(Object var1, String var2, String var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("The region-name \"{0}\" for {1} is not permitted. Line({2})\\Col({3})",new Object[]{ var3, var2, var4.n5(), var4.l6()}));
   }

   @Override
   public final void k5(Object var1, String var2, String var3, boolean var4, com.aspose.slides.internal.w2.u9 var5) {
      this.n5(
         d1.n5(
            "Border and padding for {0} \"{1}\" should be '0' (See 6.4.14 in XSL 1.1); non-standard values are allowed if relaxed validation is enabled.Line({2})\\Col({3})",new Object[]{
            var2,
            var3,
            var5.n5(),
            var5.l6()
         })
      );
   }

   @Override
   public final void l6(Object var1, String var2, com.aspose.slides.internal.w2.u9 var3) {
      this.n5(
         d1.n5(
            "If overflow property is set to \"scroll\" on {0}, a column-count other than \"1\" may not be specified. Line({1})\\Col({2})",new Object[]{
            var2,
            var3.n5(),
            var3.l6()
         })
      );
   }

   @Override
   public final void k5(Object var1, String var2, com.aspose.slides.internal.w2.u9 var3) {
      this.n5(
         d1.n5(
            "First element must be the fo:root formatting object. Found {0} instead. Please make sure you're producing a valid XSL-FO document.",
            new Object[]{var2}
         )
      );
   }

   @Override
   public final void n5(Object var1) {
      this.n5("Document is empty (something might be wrong with your XSLT stylesheet).");
   }

   @Override
   public final void l6(Object var1, String var2, com.aspose.slides.internal.o0.l6 var3, com.aspose.slides.internal.w2.u9 var4) {
      this.n5(d1.n5("Unknown formatting object \"{0}\" encountered (a child of {1}. Line({2})\\Col({3})",new Object[]{ var3, var2, var4.n5(), var4.l6()}));
   }

   @Override
   public final void u3(Object var1, String var2, com.aspose.slides.internal.w2.u9 var3) {
      this.n5(d1.n5("Alternate text is missing on {0}. Line({1})\\Col({2})",new Object[]{ var2, var3.n5(), var3.l6()}));
   }
}
