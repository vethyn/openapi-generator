/*
 * OpenAPI Dates
 *
 * Thic spec contains endpoints with dates in different formats
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// NowGet200Response
    /// </summary>
    [DataContract(Name = "_now_get_200_response")]
    public partial class NowGet200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NowGet200Response" /> class.
        /// </summary>
        /// <param name="today">today.</param>
        /// <param name="now">now.</param>
        public NowGet200Response(DateTime today = default(DateTime), DateTime now = default(DateTime))
        {
            this.Today = today;
            this.Now = now;
        }

        /// <summary>
        /// Gets or Sets Today
        /// </summary>
        [DataMember(Name = "today", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Today { get; set; }

        /// <summary>
        /// Gets or Sets Now
        /// </summary>
        [DataMember(Name = "now", EmitDefaultValue = false)]
        public DateTime Now { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NowGet200Response {\n");
            sb.Append("  Today: ").Append(Today).Append("\n");
            sb.Append("  Now: ").Append(Now).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
